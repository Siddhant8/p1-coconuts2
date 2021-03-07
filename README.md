# README for p1-coconuts #

## Project Plan ##

Summary: Our project involves creating a tea shop web server using Spring, and interacting with the tea shop in various ways. These “various ways” would be a jukebox, or ordering a beverage, or a coronavirus case tracker in the area (just to name a few). Some of these would be independent due to simplicity, but could also involve collaboration to blow them up in proportion. For example, the coronavirus tracker may start out as just a text box but then be blown up into an animation. 

# Link to Scrum Board #
https://github.com/Siddhant8/p1-coconuts2/projects/2

The "Done" Column contains each person's code links to the code for their respective tickets.

## Coconuts Shopping ##
https://www.p1coconuts.tk/

![image](https://user-images.githubusercontent.com/54915593/108390132-3369cd80-71c5-11eb-9279-eb70cfae03d2.png)
![image](https://user-images.githubusercontent.com/54915593/108390158-3bc20880-71c5-11eb-90fe-070470ccdb97.png)
https://github.com/AndrewH06/teashop2

This program uses a database to dynamically generate products and item in your cart. To add something to your cart, click the cart+ icon on the card for the product you want. The item then is generated in your cart array and stored in your cookies.

## Coconuts Chat ##
https://coconutschat.tk

![image](https://user-images.githubusercontent.com/54915593/108390067-22b95780-71c5-11eb-9572-d6d2cc1f3c31.png)
https://github.com/AndrewH06/coconutschat

Logins:
User: aidanr Pass: aidanr
User: siddhantr Pass: siddhantr
User: johnm Pass: johnm

This site is a personalized chat system where I can manage users and chat rooms. Right now, you can send messages and images using this program. To send a message, type what you want to send and hit the "enter" key on your keyboard, or the arrow on the screen. To upload an image, hit the image icon on the message line and upload a file. This is a chat system created with API.

## Coronavirus Case Calculator ##
### Summary ###
The coronavirus case simulator simulates the exponential growth of the coronavirus pandemic for a community of 2000 people. The Exponential growth formula is written in 4 different ways. There will be one web page for each formula. For each web page, the initial number of people who have coronavirus is 1 percent of the total population. The user will input the number of days the coronavirus pandemic has gone on for during the simulation. The maximum number of days the user can input into the system is 25. When the user clicks enter the total number of coronavirus cases up to that specific day into the pandemic will appear on the webpage. After the simulation this webpage contains more information about what exponential growth is and provides warnings about the dangers of the coronavirus pandemic.

### Runtime ###
On the main menu bar of the home page there is a button that says Covid-19 Simulation. Clicking that button will take the user to the simulation page that contains a description about exponential growth and the simulation using the first version of the exponential growth formula. There will be a small portion of the text in the beginning explaining the setting and background of the simulation. The user's job is to input a number from 1 to 25 into the textbox on the website. That number 1 - 25 represents the number of days that have passed since the Coronavirus outbreak began. When the user clicks enter after inputting their number, the line of text below the textfield displays the total number of cases up to the day number the user has inputted. After the simulation there is another small section of text describing exponential growth as more information about the simulation.

### Technicals Outline ###
An MVC design structure is used to handle user input and perform actions based on user input. The code is split into the model, the controller, and the view. The model code uses instance variables, constructors, getters and setters, static methods, and objects to handle data and user input. The view code is written in HTML. Links are embeded to access the different web pages for this coronavirus case simulation and to access the home page. A textfield is created to input the number of days and a button is created to enter the number of cases into the system in html. ${} is used to display the total number of cases on the website, which changes with different inputs. Finally, the controller uses GetMapping to create and access the specific query string for each part of the webpage, RequestParam to receive the input, and uses .addAttribute to exchange information between the view and the model. This specific MVC design and these specific technicals are used for each formula's webpage. However, the mathematical operations for the model code for each formula's webpage is different.   


## JukeBox ##
<img width="1023" alt="Screen shot" src="https://user-images.githubusercontent.com/43625295/108452522-80798e00-721d-11eb-8579-192355a4273b.PNG">

Please note that the grey box with the sad file is because the youtube HTML tag doesn't work when running on localhost. Please use the Heroku link to access the site.

This jukebox can be navigated to by clicking the link "go to jukebox here" on the home page. This JukeBox will be basically the same as the Java version, where URLs can be saved as "cassettes". The difference now will be that urls will be stored in a database as a key-value pair, and will be fetched whenever the site is loaded. 

For now, a sample youtube url has been embedded, along with an input field to the left (it doesn't do anything right now). There's also a link to go straight back to the home page.


## Big Ticket Items ##

<img width="771" alt="Screen Shot 2021-01-27 at 8 01 51 AM" src="https://user-images.githubusercontent.com/71453341/106018351-44b43400-6076-11eb-85a3-48a61aa70f7f.png">
<img width="769" alt="Screen Shot 2021-01-27 at 8 02 24 AM" src="https://user-images.githubusercontent.com/71453341/106018358-467df780-6076-11eb-9ca5-a9399211193b.png">

### Visual Display of Tickets ###
<img width="785" alt="Screen Shot 2021-02-02 at 8 12 56 PM" src="https://user-images.githubusercontent.com/71453341/106697185-1e6d2780-6593-11eb-9719-c7b0d467b7eb.png">



### Members' Github Links ###
| Name | ID | Link | 
| --- | --- | --- | 
| Siddhant Ranka | Siddhant8 | https://github.com/Siddhant8 |
| Aidan Rosen | AidanRosen |https://github.com/AidanRosen | 
| Andrew Hale| Andrew H06 |https://github.com/AndrewH06 |
