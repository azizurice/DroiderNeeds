## App that uses Fragments

In this app, we will see how we can use fragment. You will have very good description about Fragment [here](https://developer.android.com/guide/components/fragments.html). In sort, a fragment represents a portion of UI of an Activity, it has its own life-cycle, and it can be reused in multiple activities.

### Goal
Suppose, we want to show a list of Movies and their brief wiki details from in one of our apps. We have different kinds of android devices( different screen sizes). How can we arrange the GUIs. We can solve this problem using Fragment. How? We can use two fragments: one for displaying movie names and one for displaying their details. In Android Phone, we will inflate(insert) MoviesFragment first, and when user clicks on any particular movie name, it will show the details fragment (WikiDetailsFragment). However, for large screen sizes devices or phone in landscape mode, we can display both fragments together, otherwise most of the spaces will remain blank(which is not good from user experience perspective).


Using this app, we have achieved this goal, please clone the project, import it in Android Studio and play with it. Hope, it will help you to know the advantages of fragments.


See the results and project.

Output and Project Structure
============================

- When our device is phone and orientation is portrait

<img src="https://github.com/azizurice/DroiderNeeds/blob/master/AppSeven/doc/images/Portrait.png" width="600px" height="400px" />

- When our device is tablet or phone but orientation is landscape

<img src="https://github.com/azizurice/DroiderNeeds/blob/master/AppSeven/doc/images/Ladscape.png" />

- Project Structure

<img src="https://github.com/azizurice/DroiderNeeds/blob/master/AppSeven/doc/images/ProjectStructure.png" width="800px" height="600px" />


