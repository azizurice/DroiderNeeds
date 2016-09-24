## App that uses Fragments

In this app, we will see how we can use fragment. You will have very good description about Fragment [here](https://developer.android.com/guide/components/fragments.html). In sort, a fragment represents a portion of UI of an Activity, it has its own life-cycle, and it can be reused in multiple activities.

### Goal
Suppose, we want to show a list of employees and their details in one of our app. We have different kinds of android devices( different screen sizes). How can we arrange the GUIs. We can solve this problem using Fragment. How? We can use two fragments: one for displaying Employee names and one for displaying their details. In Android Phone, we will inflate(insert) EmployeeNameFragment first, and when user clicks on any particular EmpployeeName, it will show the details fragment (EmployeeDetailsFragment). However, for large screen sizes devices or phone in landscape mode, we can display both fragments together, otherwise most of the spaces will remain blank(which is not good from user experience perspective).


Using this app, we have achieved this goal, please clone the project, import it in Android Studio and play with it. Hope, it will help you to know the advantages of fragments.
