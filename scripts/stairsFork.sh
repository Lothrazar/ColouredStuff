#!/bin/bash


[[ -z "$1" ]] && { echo "seed is empty for example: planks. make sure your _black version works first" ; exit 1; }

declare -a arr=("blue" "brown" "cyan" "gray" "green" "light_blue" "light_gray" "lime" "magenta" "none" "orange" "pink" "purple" "red" "white" "yellow")
declare -a names=("Blue" "Brown" "Cyan" "Gray" "Green" "Light Blue" "Light Gray" "Lime" "Magenta" "Colorless" "Orange" "Pink" "Purple" "Red" "White" "Yellow")


input=$1
seed=stairs_$1
#echo $seed;
#echo $input;
#exit 1;

modid="colouredstuff"
folder="src/main/resources/assets/${modid}"

folderdata="src/main/resources/data/${modid}"


arraylength=${#arr[@]}
## now loop through the above array
# use for loop to read all values and indexes
echo "\"block.colouredstuff.${seed}_black\" : \"Black Brick Stairs\","
for (( i=0; i<${arraylength}; i++ ));
do
   color="${arr[$i]}"
   name="${names[$i]}"
  # echo "$color"
   
   # blockstate      
	cp "${folder}"/blockstates/"${seed}"_black.json "${folder}"/blockstates/"${seed}"_"${color}".json
	sed -i -e "s/black/${color}/g" "${folder}"/blockstates/"${seed}"_"${color}".json
	
	# item model
	cp "${folder}"/models/item/"${seed}"_black.json "${folder}"/models/item/"${seed}"_"${color}".json
	sed -i -e "s/black/${color}/g" "${folder}"/models/item/"${seed}"_"${color}".json
	
	# block model  
	cp "${folder}"/models/block/stairs/"${input}"_black.json "${folder}"/models/block/stairs/"${input}"_"${color}".json
	sed -i -e "s/black/${color}/g" "${folder}"/models/block/stairs/"${input}"_"${color}".json
	cp "${folder}"/models/block/stairs/"${input}"_black_inner.json "${folder}"/models/block/stairs/"${input}"_"${color}"_inner.json
	sed -i -e "s/black/${color}/g" "${folder}"/models/block/stairs/"${input}"_"${color}"_inner.json
	cp "${folder}"/models/block/stairs/"${input}"_black_outer.json "${folder}"/models/block/stairs/"${input}"_"${color}"_outer.json
	sed -i -e "s/black/${color}/g" "${folder}"/models/block/stairs/"${input}"_"${color}"_outer.json
	
	# loot
	cp "${folderdata}"/loot_tables/blocks/"${seed}"_black.json "${folderdata}"/loot_tables/blocks/"${seed}"_"${color}".json
	sed -i -e "s/black/${color}/g" "${folderdata}"/loot_tables/blocks/"${seed}"_"${color}".json
   
    #recipes
	cp "${folderdata}"/recipes/stairs/"${seed}"_black.json "${folderdata}"/recipes/stairs/"${seed}"_"${color}".json
	sed -i -e "s/black/${color}/g" "${folderdata}"/recipes/stairs/"${seed}"_"${color}".json
	#stone cutter or other variants 
	cp "${folderdata}"/recipes/stairs/"${seed}"_black_sc.json "${folderdata}"/recipes/stairs/"${seed}"_"${color}"_sc.json
	sed -i -e "s/black/${color}/g" "${folderdata}"/recipes/stairs/"${seed}"_"${color}"_sc.json

	echo "\"block.colouredstuff.${seed}_${color}\" : \"${name} Brick Stairs\","
	 
done

# for datatags 
echo "\"colouredstuff:${seed}_black\","
for (( i=0; i<${arraylength}; i++ ));
do
   color="${arr[$i]}"

	echo "\"colouredstuff:${seed}_${color}\","
 
done

