#!/bin/bash


[[ -z "$1" ]] && { echo "seed is empty for example: planks. make sure your _black version works first" ; exit 1; }

declare -a arr=("blue" "brown" "cyan" "gray" "green" "light_blue" "lime" "magenta" "none" "orange" "pink" "purple" "red" "white" "yellow")


seed=$1


modid="colouredstuff"
folder="src/main/resources/assets/${modid}"

folderdata="src/main/resources/data/${modid}"


## now loop through the above array
for color in "${arr[@]}"
do
   echo "$color"
   # or do whatever with individual element of the array
   
   
	cp "${folder}"/blockstates/"${seed}"_black.json "${folder}"/blockstates/"${seed}"_$color.json

	sed -i -e "s/black/${color}/g" "${folder}"/blockstates/"${seed}"_$color.json
   
done

