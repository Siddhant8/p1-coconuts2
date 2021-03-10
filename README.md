# README for p1-coconuts #

## Project Plan ##

Summary: Our project involves creating a tea shop web server using Spring, and interacting with the tea shop in various ways. These “various ways” would be a jukebox, or ordering a beverage, or a coronavirus case tracker in the area (just to name a few). Some of these would be independent due to simplicity, but could also involve collaboration to blow them up in proportion. For example, the coronavirus tracker may start out as just a text box but then be blown up into an animation. 

# Link to Scrum Board #
https://github.com/Siddhant8/p1-coconuts2/projects/2
### Assignments ###
Siddhant - Create the Coronavirus Case Calculator and write it in four ways.

Andrew Hale - Create a REACT tea shop and the Home Page.

Aidan Rosen - Create a JukeBox that saves Youtube URL's into a database.

## Website ##
https://coconuts1.herokuapp.com/

![image](https://user-images.githubusercontent.com/54915593/110501992-9f966d80-80af-11eb-974f-bb9aacc40513.png)

## FRQs ##
To get to the FRQs, click the coconuts on the home page.
![image](https://user-images.githubusercontent.com/54915593/110502322-f3a15200-80af-11eb-993a-c1fc31d47e08.png)

Here you will find the link to the journal and all of our FRQs from the year.
![image](https://user-images.githubusercontent.com/54915593/110502352-fb60f680-80af-11eb-9a0e-a2759c99a6c1.png)

## Juke Box Technicals ##
![githubUpload](https://user-images.githubusercontent.com/43625295/110549495-fd927780-80e6-11eb-8af9-161db84fe2f8.PNG)


The jukebox uses these files: jukebox.html (the view), BasicPojo and JukeBoxModel (my POJO's), JukeBox Controller (for Thymeleaf attributes and database communication), JukeBoxRepository and SongSqlRepository (for handling the database), and load database (to initialize database). 

How does it work? (Technicals):
in the HTML file, jukebox.html, there is some [Javascript styling](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/resources/templates/jukebox.html#L8) and my Thymeleaf syntax is used for [inputs into paragraph tags and a youtube embedding](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/resources/templates/jukebox.html#L42) 

The Thymeleaf attributes rely on my JukeBox controller, which revolves around a single button from JukeBox HTML <-- [at the top of the method](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/java/com/example/p1coconuts/JukeBoxController.java#L20)

The complicated stuff is the database: everything is initialized in [JukeBoxRepository](https://github.com/Siddhant8/p1-coconuts2/blob/main/src/main/java/com/example/p1coconuts/JukeBoxRepository.java) and [SongSqlRepository](https://github.com/Siddhant8/p1-coconuts2/blob/main/src/main/java/com/example/p1coconuts/SongSqlRepository.java)

Data is saved to the database upon pressing the button in JukeBox.html, and the code is [here](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/java/com/example/p1coconuts/JukeBoxController.java#L44). The website relies on using the latest addition to the database to display as a youtube video. There is a bug with this, written below. The URL of the saved JukeBoxModel - my pojo - is fetched by gathering the data as a list, getting the [last element in the list which is the most recent addition](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/java/com/example/p1coconuts/JukeBoxController.java#L53). This string is used to display the youtube video, and as text on the page under the attributes [inputtedUrl and reversedInput](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/java/com/example/p1coconuts/JukeBoxController.java#L108). 

Runtime: 

Go to the website via Heroku and the provided URL. It should look like the photo above. Then, navigate to a youtube video and use the URL. In reality, you should need the embed link which is from pressing the share button, but my code doesn't work properly so it doesn't matter - for now - what you use. Then go back to the website and copy paste that url to the blank white field. Then press go.

What happens is that the two paragraph tags towards the bottom of the page should update to what you just input, where the second is the same url reversed, and then you can leave the page and return and see the exact same URL. 

Why my youtube embed doesn't work: it's very strange. Despite making sure my Thymeleaf attribute uses actual embed code and running several tests with the information fetched from the database, the HTML tag doesn't seem to accept it. It appears to be an error with HTML rather than Java, and I do not have the time to fix it soon enough. It's especially strange since the URL right now for the youtube embed is just a default value, but the embed continues to break whenever I press the go button. Here is the code for where my URL for the embed is defined [if you'd like to look](https://github.com/Siddhant8/p1-coconuts2/blob/0921e98c3d38d9dbdac4bc171ac9b8a619cda108/src/main/java/com/example/p1coconuts/JukeBoxController.java#L34). Also, even when I defined URL outisde the provided control flow statement, the HTML still glitched out :(.

## Coronavirus Case Calculator ##

<img width="1440" alt="Screen Shot 2021-03-07 at 8 22 49 PM" src="https://user-images.githubusercontent.com/71453341/110274151-04a07500-7f83-11eb-86bc-8417f897d83a.png">

### Summary ###
The coronavirus case simulator simulates the exponential growth of the coronavirus pandemic for a community of 2000 people. There are 4 different exponential growth formulas. Each formula creates the same output, the formula's are just written differently. There will be one web page for each formula. For each web page, the initial number of people who have coronavirus is 1 percent of the total population. The user will input the number of days the coronavirus pandemic has gone on for during the simulation. The minumum number of days the user can input is 1 and the maximum number of days the user can input into the system is 25. When the user clicks enter the total number of coronavirus cases up to that specific day into the pandemic will appear on the webpage. After the simulation this webpage contains more information defining exponential growth.

### Runtime ###

#### Ex. This is the Page for the Second Formula. The link attatched saying Formula leads back to the first page shown in the initial picture above the Summary. The links attatched saying Formula 3 and Formula 4 lead to pages with Formulas 3 and 4 Respectively. ####
<img width="1430" alt="Screen Shot 2021-03-07 at 8 23 15 PM" src="https://user-images.githubusercontent.com/71453341/110274156-05d1a200-7f83-11eb-91c8-9241a6c370ab.png">

On the main menu bar of the home page there is a button that says Covid-19 Simulation. The  Coronavirus simulation uses 4 formulas. There are also 4 pages, 1 page simulating each formula. Clicking the Covid-19 Simulation button takes the user to the page using the first formula. There the user can run the simulation using formula 1, and there are links taking the user to the pages using formula's 2, 3, and 4. The pages for formula's 2, 3, and 4 also have links leading back to the other formulas, including formula 1.

### Technicals Outline ###
For each specific web page, an MVC design structure is used to handle user input and perform actions based on user input. The code is split into the model, the controller, and the view. The model code uses instance variables, constructors, getters and setters, static methods, and objects to handle data and user input. The view code is written in HTML. Links are embeded to access the different web pages for this coronavirus case simulation and to access the home page. A textfield is created to input the number of days and a button is created to enter the number of cases into the system in html. ${} is used to display the total number of cases on the website, which changes with different inputs. Finally, the controller uses GetMapping to create and access the specific query string for each part of the webpage, RequestParam to receive the input, and uses .addAttribute to exchange information between the view and the model. This specific MVC design and these specific technicals are used for each formula's webpage. However, the mathematical operations for the model code for each formula's webpage is different.   


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

## Coronavirus Database - Side project ##
This is a built in database that shows the the number of coronavirus cases in San Diego County for each age group as of February 15th. Click the Covid-19 Database button in the main menu to access it. The database was built by inputting the data into a built in H2 Database. The Controller then connected to both the built-in database and the model code that printed out the database in a specific form.


### Members' Github Links ###
| Name | ID | Link | 
| --- | --- | --- | 
| Siddhant Ranka | Siddhant8 | https://github.com/Siddhant8 |
| Aidan Rosen | AidanRosen |https://github.com/AidanRosen | 
| Andrew Hale| Andrew H06 |https://github.com/AndrewH06 |
