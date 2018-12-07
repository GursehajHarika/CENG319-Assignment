# CENG319-Assignment

# Title

 Picasso Library 

# Introduction 

Pictures make everything more appealing, especially in applications. Picasso image library makes the process of adding that magical element of having a picture in your application easy. usually in a one line of code.

In picasso library, pictures from the Internet, Data and even images from the memory can all be displayed.

# History





# The Major Meathods and Attributes

before you could start using the Picasso Library, there are some things that need to be done 


Either by going into 

First, go into the AndroidManifest.XML
and add the following permission,

    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.INTERNET" />


under Gradle Scripts, go in build.gradle and add 

    implementation 'com.squareup.picasso:picasso:2.71828'

under dependecies.Click on Sync button located on the top which looks like <img width="51" alt="syncgradleicon" src="https://user-images.githubusercontent.com/43185907/49630410-0356fb00-f9bc-11e8-891a-b667deff6c84.png">
 
 Note :- There is a Bug in the Picasso library, Any file larger than 10MB willl have a problem with loading your picture.
 
 then in the XML file, create a ImageView with all the necessary components, youre code should look somthing like this 

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="226dp"
        android:layout_height="272dp"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.052" />


 Now in the main Java class initalize the view,
 
 
     public ImageView imager;
     

and add this in OnCreate,
   
      imager = (ImageView)findViewById(R.id.imageView);

Finally ,in order to impliment the Picasso library add the following lines of code


      Picasso.get().load(URL).into(imageview);
      

with URL being a String whose value is the link to the image you wish to load from.

if you want to load from the disk try this

        Picasso.get().load(R.mipmap.Image_name).into(imageview);




![picasso_working2](https://user-images.githubusercontent.com/43185907/49633891-0c01fe00-f9c9-11e8-9b3b-8b4bdf376765.gif | width=100)




# Example Project

Here’s the link for my project that shows how the Picasso library works.
this project has one image being loaded from the internet and one from disk.

https://github.com/GursehajHarika/CENG319-Assignment/tree/master/picassoassignment




# Code 




# Refrences

https://stackoverflow.com/questions/28603191/how-to-add-picasso-library-in-android-studio
http://square.github.io/picasso/

https://guides.codepath.com/android/Displaying-Images-with-the-Picasso-Library
https://stacktips.com/tutorials/android/how-to-use-picasso-library-in-android

the Image used in the Application is from 
https://www.moma.org/d/assets/W1siZiIsIjIwMTYvMDgvMDQvMW1yOXAxYXRhN18yXzE5MzhfQ0NDUi5qcGciXSxbInAiLCJjb252ZXJ0IiwiLXJlc2l6ZSAyMDAweDIwMDBcdTAwM2UiXV0/2_1938_CCCR.jpg?sha=c75b58704e7f990d
