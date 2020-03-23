##Make Change Project - Week 1 Skill Distillery

### Overview
The user is asked to input the cost of an item and the amount used to pay for the item. IF the user did not
pay enough, they are informed of the error. If they paid the exact price of the item they are informed that there is no change.

If change is due, the code will determine the change due in the highest denominations possible with the Twenty Dollar bill being the highest, and the penny being the lowest. 
The code works by calling separate methods in a cascading order from highest($20 bill) to lowest(penny). It uses the modulus (%) function to return the leftover amounts from the higher denomination to input into the lower amounts. if the leftover change (modulus) can be interrogated by the lower method, a value is returned, indicating the amount of that denomination to be included in the final change. if the leftover change is zero, or not large enough to make change with that denomination, changeInt will be recycled and brought into the next method.
The output details the exact change required
#### Technologies Used
- Eclipse
- Java
- Terminal
- GitHub/git

### Lessons Learned

1. Converting between integer and double is important, useful... and dangerous.

2. Google is helpful to find topics and techniques that we have not been taught yet. When 
I was trying to figure out a way to ensure doubles would maintain 2 decimal places, I put 
it to the google machine to help. I found a quick and easy solution.

3. Do not import the whole java systems library. It may seem easy in the beginning, but after
reading further on the topic I found that it could cause issues when trying to make updates later on. 

4. I hope that I am using it correctly... but the "Coverage as" option was very useful while creating 
my code. It seems to show the "path" the code took during its execution. I was able to pinpoint a few logic
issues using this. I accidently clicked on it when I had meant to hit the "run as" option. Helpful mistake.

5. I hit a wall when trying to figure out which value to use when the change due was less than $20. If you look at the code, i had to constantly refer to changeInt in case the change was lower that $20. However, that interfered with the value i was sending down if the previous method was interrogated.  I knew that somewhere I would have to make changeInt = leftover'denomination'. But I was still running into issues with the wrong value cascading down into the lower methods.  I fixed this by including the else statement making changeInt = 0 (if leftover'denomination'). This stopped the incorrect value from being sent down into the rest of the code. 

