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



 
