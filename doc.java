/*
Q.Difference betwen Aggregation and composition. 

Q.What is enum. 
A.Enum is the special type in Java where the Objects are defined within the Enum. They are pre-defined. 
  Whenever we have a pre-defined list of singleton objects or constants , we can make use of enums. 

Q.Write a design pattern except singleton. 
  Write binary search. Write recursive binary search. 

Q.Elaborate on man in middle attack. 
A.Man in the middle attack is for the security attack where a process in the middle hides and 
  mediates a private commuication between two parties.

Q.How you create a branch - why in svn? 
A.We create a svn branch by forking a master or another child branch.

  Explain the architecture of your previous work experience. 
  Explain thread concept of synchronization.

*/

/*
Q.What are immutable objects? What are their Advantages? 
  Design a immutable object with Date object as a member attribute. 
A.An object is considered immutable if its state cannot change after it is constructed. 
  Advantages : 
  1. Simple and Reliable Code. 
  2. Useful in concurrency applications, cannot be corrupted by thread interference and memory inconsistencies

*/
public final class Mydate {
    private final Date date; // Declare the variable as final

    public Mydate(Date date) {
        this.date = new Date(date.getTime());
    }
    public getDate() {
        return new Date(date.getTime()); // Need to return a copy instead of original object
    }
    
     // Note: No Setter method for date
}


/*
Q.Time complexity of Hash Map storage and retrieval in Java.
A.All operations on Hashtable or Hashmap are O(1) 
  assuming the uniform distribution of the key in the table and avoiding the collision of the key. 
  Avoiding collision and uniform distribution is all depends how hash function is well implemented which is very critical implementation.
  hashFunction(key)=> Memory Location
  Worst case O(N) if you override hashcode to return the same value for all objects.
  
*/

/*
Q.Which Design patterns have you worked on? What is Singleton? Design a Singleton Class. Make it thread safe.
A.Certain design problems seen again and again are well thought over and best practices determined to approach them.

*/ 

/*
Q.There is a sorted array of integers (suppose sorted in "ascending order"). 
  How will you find a specific element in an array? 
  You can not use traditional iterative method to find a specific element in an array.
A.Binary Search: 
  Mid calculation: avoid overflow
  Consider a scenario where low = 5, high = 7. 
  Note that these are numerals above are representing index of array not elements of array. 

  Ideally - our mid should be index no 6 
  Now you can calculate mid like this 

  mid = (low + high) / 2 

  You will get correct answer which is 6. 
  But this can fail when the sum of low and high exceeds the integer limit defined for that data type in that language. 

  So, the correct way is 

  mid = low + (high - low) / 2

*/

/*
Q.Where is primitive data stored in java memory?
A.Stack memory stores "primitive types" and "addresses of objects". 
  The "object values" are stored in heap memory. An object reference on the stack is only an address that refers to the place in heap memory where that object is kept.
  
  Local primitives: stack
  Instance primitives: the primitive data types inside an object are part of the object hence would be on heap.
*/


/*
Q.We're playing a game. Cards numbered from 1-10 are placed in a hat. 
  Whatever card is drawn is the paid out amount. 
  How much should i charge you to play this game? 
  If you can redraw by placing the first card back into the hat, what is the new price?
A.First case : 
  Card are drawn randomly from hat, so probability of each card is 1/10 
  So expected value(average) is :
  1*1/10 + 2*1/10 + 3*1/10 + ...  + 9*1/10 + 10*1/10 = (1+2+....+9+10)/10 = 5.5

  Second Case : If the person "has to choose" second card then, 
  we need to know the probability distributon that if 1 comes then what is the probability that he gonna make 2nd choice. 
  Once we know that we can able to find the ourcome.
  
  A rational user draws a second card in exactly 50% of cases, i.e. only if the first card is 1/2/3/4/5. 
  If the cases where he holds the "first card, his expected return" is 8, i.e the average of 6/7/8/9/10. 
  In the cases where he draws a second card, his expected return is 5.5. 
  His overall expected return is the mean of 8 and 5.5, which is 6.75. 
  
  If the user were allowed to return up to two cards to the hat (i.e. up to "three turns"), 
  then on the first turn, he only holds the 7/8/9/10, knowing the result of the two-turn game. 
  His expected outcome then becomes 0.4*8.5 + 0.6*6.5, or 7.3. 
  
  In the four-turn game, he only settles with 8/9/10 on the first hand, and his expected return is 0.3*9 + 0.7*7.3, or 7.81. 
  You can obviously write a program to determine the strategy for an arbitrary number of turns. 
  
  For a high enough n, the user's strategy is eventually to return anything other than a 10, 
  but for low values of n, he needs to be careful about throwing away 6s, 7s, 8s, etc., for fear of getting worse cards on the redraws.
 
*/


/*http://www.careercup.com/page?pid=java-developer-interview-questions
  http://www.careercup.com/question?id=15207726
  http://www.careercup.com/question?id=17405684
  http://www.careercup.com/question?id=16368665
  http://www.careercup.com/question?id=15388725
*/
