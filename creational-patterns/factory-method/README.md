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

## Code
#### Step 1:
Create a Transport interface that is common for all the objects which is created by the factory method.
#### Step 2:
Create concurrent classes which are different implementations of the Transport interface.

![Transport](/src/main/resources/Transport.png "Transport")

#### Step 3;
Create a Logistics class and declare a factory method that can return instances of Transport Type

#### Step 4:
Override factory method in different concurrent classes to create Transport objets based on the business logic.

![Logistics](/src/main/resources/Logistics.png "Logistics")
