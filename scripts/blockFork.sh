#!/bin/bash


[[ -z "$1" ]] && { echo "seed is empty for example: planks. make sure your _black version works first" ; exit 1; }

declare -a arr=("blue" "brown" "cyan" "gray" "green" "light_blue" "light_gray" "lime" "magenta" "none" "orange" "pink" "purple" "red" "white" "yellow")
declare -a names=("Blue" "Brown" "Cyan" "Gray" "Green" "Light Blue" "Light Gray" "Lime" "Magenta" "Colorless" "Orange" "Pink" "Purple" "Red" "White" "Yellow")


seed=$1


modid="colouredstuff"
folder="src/main/resources/assets/${modid}"

folderdata="src/main/resources/data/${modid}"


arraylength=${#arr[@]}
## now loop through the above array
# use for loop to read all values and indexes
echo "\"block.colouredstuff.${seed}_black\" : \"Black Smooth Sandstone\","
for (( i=0; i<${arraylength}; i++ ));
do
   color="${arr[$i]}"
   name="${names[$i]}"
  # echo "$color"
   
   # blockstate      
	cp "${folder}"/blockstates/"${seed}"_black.json "${folder}"/blockstates/"${seed}"_$color.json
	sed -i -e "s/black/${color}/g" "${folder}"/blockstates/"${seed}"_$color.json
	
	# item model
	cp "${folder}"/models/item/"${seed}"_black.json "${folder}"/models/item/"${seed}"_$color.json
	sed -i -e "s/black/${color}/g" "${folder}"/models/item/"${seed}"_$color.json
	
	# block model
	cp "${folder}"/models/block/"${seed}"_black.json "${folder}"/models/block/"${seed}"_$color.json
	sed -i -e "s/black/${color}/g" "${folder}"/models/block/"${seed}"_$color.json
	
	# loot
	cp "${folderdata}"/loot_tables/blocks/"${seed}"_black.json "${folderdata}"/loot_tables/blocks/"${seed}"_$color.json
	sed -i -e "s/black/${color}/g" "${folderdata}"/loot_tables/blocks/"${seed}"_$color.json
   
   #recipe
	cp "${folderdata}"/recipes/sandstone/cut_black.json "${folderdata}"/recipes/sandstone/cut_$color.json
	sed -i -e "s/black/${color}/g" "${folderdata}"/recipes/sandstone/cut_$color.json
	
   #SC recipe
	cp "${folderdata}"/recipes/sandstone/cut_black_sc.json "${folderdata}"/recipes/sandstone/cut_"${color}"_sc.json
	sed -i -e "s/black/${color}/g" "${folderdata}"/recipes/sandstone/cut_"${color}"_sc.json
	
	#stone cutter or other variants 
#	cp "${folderdata}"/recipes/"${seed}"_black_sc.json "${folderdata}"/recipes/"${seed}"_"${color}"_sc.json
#	sed -i -e "s/black/${color}/g" "${folderdata}"/recipes/"${seed}"_"${color}"_sc.json

	echo "\"block.colouredstuff.${seed}_${color}\" : \"${name} Smooth Sandstone\","
	 
done

# for datatags 
echo "\"colouredstuff:${seed}_black\","
for (( i=0; i<${arraylength}; i++ ));
do
   color="${arr[$i]}"

	echo "\"colouredstuff:${seed}_${color}\","
 
done

