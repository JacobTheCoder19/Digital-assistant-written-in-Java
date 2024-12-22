# Digital-assistant-written-in-Java
<h2><em>💎 Key Features 💎</em></h2>
<div>
  🟩 <strong>Graphical User Interface (GUI)</strong><br>
  &emsp;🔸 Designed using JavaFX, providing a clean, resizable interface for ease of use.<br><br>
</div>
<div>
  🟩 <strong>Keyword-Based Navigation</strong><br>
  &emsp;🔸 Type a keyword to quickly access applications or websites without hassle.<br><br>
</div>
<div>
  🟩 <strong>Launch Applications</strong><br>
  &emsp;🔸 Open programs like Notepad, Calculator, Arduino IDE, and more in a click.<br><br>
</div>
<div>
  🟩 <strong>Quick Web Access</strong><br>
  &emsp;🔸 Instantly open websites like YouTube, Google Drive, and GitHub using predefined keywords.<br><br>
</div>
<div>
  🟩 <strong>Help File</strong><br>
  &emsp;🔸 Includes a text-based help file listing all supported keywords and their functions.<br><br>
</div>
<div>
  🟩 <strong>Automatic Startup</strong><br>
  &emsp;🔸 Configured to launch on computer boot-up for instant availability.<br><br>
</div>
<div>
  🟩 <strong>Error Handling</strong><br>
  &emsp;🔸 Provides feedback in the console for unsupported or invalid inputs.<br><br>
</div>


<h2><em></en>✨ Purpose / Inspiration ✨</em></h2>
&emsp;For this project like all my projects had a very important purpose to be created. At the time of creating this project I was in the first semester of my first year of college as a freshman having never taken any computer science courses before. The reason I created this application is because at the time I had a lot of websites I had to go to to complete my school work and I wanted a faster way to get to the sites then having to open up the browser and search the website(or go to my bookmarks) and then log in and then finally get to the page/materials I needed. For me, that took way to long and I wanted to be more lazy so I decided to make an application to do so. That being said, the purpose of this application is to have a graphical user interface(GUI) that I can type one keyword into and click the submit button and it open up my browser, log me in, and take me to my desired page / contents. The GUI is completely resisable and it even comes with a help file that contains a list of keywords and descriptions on what each keyword will lead the user to. In addition to this, the program also launchs itself everytime my computer boots up that way its ready to go and I can just start using it without having to open the IDE to run it.

<h2><em>⚙️ How it works ⚙️</em></h2>

&emsp;To start off, I used the JavaFX library to develop and design the graphical user interface(GUI). The interface includes a text field where the user can type a keyword and a button to submit the request. When the "Submit" button is clicked the program retrieves the text input and checks it against a list of my predefined keywords and then it opens the corresponding content. The application handles two types of actions, launcing the applications using the Runtime class from the Java standard library, and opening websites using the Desktop class. The Runtime class handles opening all the installed software on my computer like my Notepad, calculator, Arduino IDE etc. The Desktop class is used to open my default web browser and then open the specified website and then the specified content on that website. This program also includes a "help" keyword which opens a text file containing a list of keywords and the descriptions on what each one will lead the user to. My design might be simple, but it allows for fast access to my frequently used applications and websites with only having to type a single keyword to do so. Making it more efficient and faster then opening everything manually. This program also rembers the last keyword typed in so the user can go back to it if the tab is accidentally closed.
