# Factory Method

## What is the Factory Method?
Factory method is a design pattern that provides an interface to create objects in superclass, But allows subclasses to 
alter the object that will be created.

## Problem
You are creating a logistic management application the first version of the app only handles transport by Truck.
	
After a while you need to add sea transportation to your app. Since most of the code is written inside the Truck class, 
adding a new Ship class is difficult. You need to alter the existing code inside to add a new Ship class.

## Solution
Factory method suggests to replace a direct object creation with a special method called factory method. The Factory 
method returns an object referred to as Products.

Factory method is overridden in the child class and changes the products created by the method.





