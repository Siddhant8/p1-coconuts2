# README for p1-coconuts #

## Project Plan ##

Summary: Our project involves creating a tea shop web server using Spring, and interacting with the tea shop in various ways. These “various ways” would be a jukebox, or ordering a beverage, or a coronavirus case tracker in the area (just to name a few). Some of these would be independent due to simplicity, but could also involve collaboration to blow them up in proportion. For example, the coronavirus tracker may start out as just a text box but then be blown up into an animation. 

# Link to Scrum Board #
https://github.com/Siddhant8/p1-coconuts2/projects/2

The "Done" Column contains each person's code links to the code for their respective tickets.

## Homepage ##

![image](https://user-images.githubusercontent.com/54915593/110501992-9f966d80-80af-11eb-974f-bb9aacc40513.png)

## FRQs ##
To get to the FRQs, click the coconuts on the home page.
![image](https://user-images.githubusercontent.com/54915593/110502322-f3a15200-80af-11eb-993a-c1fc31d47e08.png)

Here you will find the link to the journal and all of our FRQs from the year.
![image](https://user-images.githubusercontent.com/54915593/110502352-fb60f680-80af-11eb-9a0e-a2759c99a6c1.png)

## Coronavirus Case Calculator ##

<img width="1440" alt="Screen Shot 2021-03-07 at 8 22 49 PM" src="https://user-images.githubusercontent.com/71453341/110274151-04a07500-7f83-11eb-86bc-8417f897d83a.png">

### Summary ###
The coronavirus case simulator simulates the exponential growth of the coronavirus pandemic for a community of 2000 people. There are 4 different exponential growth formulas. Each formula creates the same output, they are just written differently. There will be one web page for each formula. For each web page, the initial number of people who have coronavirus is 1 percent of the total population. The user will input the number of days the coronavirus pandemic has gone on for during the simulation. The minumum number of days the user can input is 1 and the maximum number of days the user can input into the system is 25. When the user clicks enter the total number of coronavirus cases up to that specific day into the pandemic will appear on the webpage. After the simulation this webpage contains more information defining exponential growth.

### Runtime ###

#### Ex. This is the Page for the Second Formula. The link attatched saying Formula leads back to the first page shown in the initial picture above the Summary. The links attatched saying Formula 3 and Formula 4 lead to pages with Formulas 3 and 4 Respectively. ####
<img width="1430" alt="Screen Shot 2021-03-07 at 8 23 15 PM" src="https://user-images.githubusercontent.com/71453341/110274156-05d1a200-7f83-11eb-91c8-9241a6c370ab.png">

On the main menu bar of the home page there is a button that says Covid-19 Simulation. The  Coronavirus simulation uses 4 formulas. There are also 4 pages, 1 page simulating each formula. Clicking the Covid-19 Simulation button takes the user to the page using the first formula. There the user can run the simulation using formula 1, and there are links taking the user to the pages using formula's 2, 3, and 4. The pages for formula's 2, 3, and 4 also have links leading back to the other formulas, including formula 1.

### Technicals Outline ###
For each specific web page, an MVC design structure is used to handle user input and perform actions based on user input. The code is split into the model, the controller, and the view. The model code uses instance variables, constructors, getters and setters, static methods, and objects to handle data and user input. The view code is written in HTML. Links are embeded to access the different web pages for this coronavirus case simulation and to access the home page. A textfield is created to input the number of days and a button is created to enter the number of cases into the system in html. ${} is used to display the total number of cases on the website, which changes with different inputs. Finally, the controller uses GetMapping to create and access the specific query string for each part of the webpage, RequestParam to receive the input, and uses .addAttribute to exchange information between the view and the model. This specific MVC design and these specific technicals are used for each formula's webpage. However, the mathematical operations for the model code for each formula's webpage is different.   


## JukeBox ##
<img width="1023" alt="Screen shot" src="https://user-images.githubusercontent.com/43625295/108452522-80798e00-721d-11eb-8579-192355a4273b.PNG">

Please note that the grey box with the sad file is because the youtube HTML tag doesn't work when running on localhost. Please use the Heroku link to access the site.

This jukebox can be navigated to by clicking the link "go to jukebox here" on the home page. This JukeBox will be basically the same as the Java version, where URLs can be saved as "cassettes". The difference now will be that urls will be stored in a database as a key-value pair, and will be fetched whenever the site is loaded. 

For now, a sample youtube url has been embedded, along with an input field to the left (it doesn't do anything right now). There's also a link to go straight back to the home page.


## Coconuts Shopping ##
https://coconuts-teashop.tk/

![image](https://user-images.githubusercontent.com/54915593/108390132-3369cd80-71c5-11eb-9279-eb70cfae03d2.png)
![image](https://user-images.githubusercontent.com/54915593/108390158-3bc20880-71c5-11eb-90fe-070470ccdb97.png)
https://github.com/AndrewH06/teashop2

This program uses a database to dynamically generate products and item in your cart. To add something to your cart, click the cart+ icon on the card for the product you want. The item then is generated in your cart array and stored in your cookies.

### Technicals ###
This program uses dynamic rendering and a database for the cart and products.

## Coconuts Chat ##
https://coconutschat.tk

![image](https://user-images.githubusercontent.com/54915593/108390067-22b95780-71c5-11eb-9572-d6d2cc1f3c31.png)
https://github.com/AndrewH06/coconutschat

Logins:
User: aidanr Pass: aidanr
User: siddhantr Pass: siddhantr
User: johnm Pass: johnm

This site is a personalized chat system where I can manage users and chat rooms. Right now, you can send messages and images using this program. To send a message, type what you want to send and hit the "enter" key on your keyboard, or the arrow on the screen. To upload an image, hit the image icon on the message line and upload a file. This is a chat system created with API.

### Technicals ###
This program uses a much more advanced database. It stores the logins and does login varification. It also saves your account login in your local storage. You are able to send messages and images to others in different chat rooms similar to slack.


### Members' Github Links ###
| Name | ID | Link | 
| --- | --- | --- | 
| Siddhant Ranka | Siddhant8 | https://github.com/Siddhant8 |
| Aidan Rosen | AidanRosen |https://github.com/AidanRosen | 
| Andrew Hale| Andrew H06 |https://github.com/AndrewH06 |
