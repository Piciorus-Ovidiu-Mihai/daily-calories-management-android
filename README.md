# 💻 Daily Calories Management
As a student enrolled on Android Fundamentals courses from Google Digital Workshop, 
I built an Android Application for Daily Calories Management.
The main purpose of this app is to track all calories that you eat everyday, take photos of your food and make a list with all food you usually eat.

## 🛠️ Architecture

In this architecture, known as the Activity-Fragment UI Architecture, the user interface of the Android application is designed by combining Activities and Fragments, which are constructed using XML layouts.
Activities are fundamental components in Android applications. They represent individual screens or windows in your app. Each Activity typically corresponds to a single screen or user interface, and it manages the UI elements, user interactions, and navigation for that screen.
Activities are defined in the AndroidManifest.xml file and often contain layout files (XML) that define the visual structure of the user interface.
<p align="center">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/daily-calories-management-android/blob/master/daily-calories-management-architecture-1.png">
</p>

Fragments are a way to modularize and reuse parts of the user interface. They are like "sub-Activities" that can be embedded within Activities.
These can have their own layout files (XML) and logic. They're used to create reusable components of an interface that can be combined in different ways within various Activities.
Fragments are often used for tasks such as creating navigation drawers, swipe views, or multi-pane layouts for larger screens.

<p align="center">
<img src="https://github.com/Piciorus-Ovidiu-Mihai/daily-calories-management-android/blob/master/daily-calories-management-architecture-2.png">
</p>

XML layout files are used to define the structure and appearance of user interface components within both Activities and Fragments.XML files can specify the arrangement of widgets (buttons, text fields, etc.) and the overall design of the screen. 
Layouts can be inflated and incorporated into Activities and Fragments, allowing you to create consistent and visually appealing user interfaces.

## 📷 Preview 
🏹This application has
* ⚒️ The register and login functionality implemented with Firebase

<p align="center">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-login-screen.png">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-register-screen.png">
</p>

* ⚒️ Fragments for each page and Constraint Layout for arranging all components in the view

<p align="center">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-menu.png"> 
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-cards-screen.png">
</p>

<p align="center">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-calculator-weight-screen.png">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-calculator-screen.png">
</p>

* ⚒️ Camera integration
<p align="center">
  <img src="https://github.com/Piciorus-Ovidiu-Mihai/Photos/blob/master/dcm-camera-integration-screen.png">
</p>

## 🛡️ Key Features
* Modularity: The use of Fragments promotes modularity, making it easier to build and maintain complex UIs.
* Reusability: Fragments can be reused in multiple Activities, reducing redundancy in your code.
* Dynamic UIs: Fragments can be dynamically replace one another in an Activity, providing a dynamic user experience.
* Support for Various Screen Sizes: By combining Fragments, this architecture enables creating responsive layouts for various screen sizes, from small smartphones to tablets.
* Ease of Navigation: Activities and Fragments work together to manage the flow and navigation within your application.
* Separation of Concerns: The XML layout files separate the UI design from the Java/Kotlin code, promoting a clear division of responsibilities.

##  💽 Prerequisites
* ⚙️ Android Studio and SDK Tools
* ⚙️ Firebase account

## 🚀 Getting Started
* ⭐ You can clone this repository
* ⭐ Connect to a phone with Android X by USB or an emulator
* ⭐ Build the solution

## 💻 What I used?
* 💽 `Android`
* 💽 `Java`
* 💽 `Firebase`
