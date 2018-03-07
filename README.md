# Car Dealership E Commerce Platform

This project emphasizes the design and coding of an object oriented application using multiple arrays, classes, and methods. Sequence, selection, and iteration logic are also used, as are logical program blocks, input / output dialogs, and the object-messaging model.

## Description

To create a car dealership to address the needs of the department, faculty, and students. The application would keep the inventory of different cars and their attributes and allow customers to see them.

## Database

The car inventory is stored in a text file as [database](./cars.txt) in the following format. Each line in the file holds information about a single car. Need to convert current inventory to the following text format and load cars from the text file.

### Format

color,year,make,model,price,carType,fuelType,noOfCylinders,capacity,horsePower,mpg,hasSparetire,hasFirstAidKit,hasCarpet,hasjack, carpetColor,interiorColor1,interiorColor2,hasSunRoof,hasMoonRoof

### Example

Red,2006,Hyundai,Sonata,2500,Sedan,gas,6,1000,325,22,true,true,true,true,grey,brown,creme,false,false
Orange,2016,Infiniti,QX50,38000,suv,diesel,4,2000,250,25,false,true,true,true,brown,white,grey,false,true
Yellow,2010,Toyota,Corolla,7845,Crossover,electric,8,3000,300,35,true,false,true,true,white,black,white,true,false

## Commands

- Commands: shows a list of all available commands
- List: lists the inventory of cars
- Compare m n: compares two cars, m and n
- Select n: selects car No. n and shows the details
- Engine: shows the details of the engine of the selected car
- Interior: shows the details of the interior of the selected car
- Trunk: shows the items in the trunk of the selected car
- Options: shows the details of the options installed on the selected car
- Quit : terminate the program

Response to invalid input: I don't understand the wor "[invalid input]" where the word entered is just repeated without quotation marks and braces.
