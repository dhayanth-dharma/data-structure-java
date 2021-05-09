# data-structure-java

# Data Structure and

# Algorithms

```
Student name- D. Dhayananth
Submission date- 11.06.


## Executive summary

ABC higher educational institute and that has its own library for the benefit of the students.
Librarian was found difficulties to maintain and manage the required information of the
library. Also he found difficulties in provide updated information to required employees
whenever they requested. .In order to overcome from that problem ABC institute has decided
to implement a library system to the organization. The purpose of this report is to design and
develop a system to ABC higher educational institute.

Firstly the data structures were explained in detail manner. Appropriate data structure was
selected to the system by comparing the advantages and disadvantages. The critical analysis
shows the strength and weakness of each data structures.

Then the searching and sorting algorithms were discussed. Appropriate sorting and searching
algorithms were justified with the result of critical analysis. Suitable algorithms were
implemented to the system such as insertion sort and binary search. In order to implement
those suitable data structures were used such as linked list and stack.



## Introduction

The ABC is a higher educational institute and it has its own library for the benefit of the
students. The system should eligible to manage book, member and ranked book information.
Also system should be featured with the followings characteristics.

For better security, system should encrypt the password. Whenever user tries to login
password need to be decrypted and checked with the user login details.

Also the books should be ranked in a particular order according to the expert reviews. The
system should be eligible to search a ranked book. Searching function should be implemented
by using better searching algorithm. Also better sorting algorithms should be used to better
performance.

The system will be developed and provided with required features in order to overcome from
the current issues and it will enhance the work efficient of the users.


## Data structure

Data structure is a specialized format. This structures organized data in a proper manner. Data
structures helps to the system in order to access, perform and store data in an efficient way.
There are several advantages will be gain from the use of data structures. These data
structures increase the system speed and performance in certain area. Also it allows data to be
stored in a secure manner on a computer. Data structure enables the capacity to use and
process the data on the system in an efficient manner. Also it increases the resources
management ability of the system in a well manner. Data structures increase the system
overall performance and efficiency in a well manner. Therefore the book ranking system can
perform much faster and efficiently. Data structures can be used to select or designed to store
data for the purpose of working on it with certain algorithms.

There are certain data structure can be found. General data structure includes the Linked list,
Array, Stacks, and Queues.

## (Rouse, 2012)


### Array

Array is a data structure and also it’s a method for storing data on a multiple location of a
same array (Array object). Array contains a number of objects all of which are the same size
and type. In other word array is a multiple object with the same attributes that can be
addressed individually. Each objects of an array is known as array element. Each element of
an array is stored continuously in the memory. Selected number of cells will be arranged in
memory when declaring an array. User can able to insert only restricted amount of data to an
array. (Vangie, -)

Disadvantages

```
 Static structure- Arrays cannot be easily extended or reduced on its size. The number
of items to be stored to the array is restricted.
 Insertion and deletion also expensive in array. Because the array elements are stored
in consecutive memory locations. Also specifically need to indicate the location of the
element in order to delete a relevant item of an array.
 Before defining the array size, must be aware the number of elements are to be stored
in an array.
 Since the array size is fixed, if developer allocates more memory space to the array
more than requirement, then the memory resource will be wasted. If developer
allocates less memory than requirement, then it result errors.
```
Advantages

```
 Arrays used to store multiple data items.
 Arrays accept single type of data (ex: int, char). So whenever user entered a wrong
input, it is easy to identify the input was not in a correct format. Other data structures
such as “list” and “object” may not consider the data type in many cases.
 Multiple data can be referred using a single name. So the complexity of the system
will be reduced.
 Arrays can be used to implement other data structures such as linked list, stack,
queue, etc. (Array , 2013)
```

### Linked list

Linked list is a linear data structure which contains separate objects and each object has
linked with its next object. The data will be order based on the logical order. In other word
linked list is a group of nodes (each element) which together represents a sequence. Each
element contains data and the reference (Link) to the next element in the sequence. This
structure allow user to insert or remove element at any position efficiently. Linked list does
not have any restriction in storing data. User can store data without any restriction. Linked
list also follows “Last in First out” theory. (S.Adamchik, 2009)

Advantages

```
 Linked List is Dynamic in Nature: - The Linked list is a dynamic data structure. When
creating a linked list, no need to define its size. Size of the linked list will be defined
and memory will be allocated at run time. So at run time can able to allocate memory
to the link list as much as possible.
 Linked list can shrink and grow at runtime according to the requirement.
 Easy to delete and insert: - The deletion and insertion operations are very flexible in
Linked list. Can able to insert and remove any node in any position. No need to shift
the element like array insertion. Simply need to update the next link of element.
 Better memory management: - Linked list allocate memory at compile time
dynamically. The memory will be allocated to the linked list automatically at runtime
according to its requirement. So no additional memory will be consumed. Also it
increases the memory automatically when it required. So the linked list provides a
efficient memory utilization to the system.
 User can able to access the linked list faster. Can able to expand in constant time
without memory overhead.
 Can able to implement other data structure easily using linked list such as Stack and
Queue. (Protesh, 2014)
```

Disadvantage

```
 Unnecessary memory consumption: - Pointers also need to be stored along with the
data in an element. Likewise all nodes will be containing the addresses. That can be
increase the memory consumption.
 Random access not possible in the linked list: - in order to access an element from the
linked list (assume 19th element), it required traverse linked list 19th times. That means
need to access the each node sequentially. Can’t be accessible randomly like array.
 Time consuming: - Linked list cannot be accessible randomly. Each node is not
stored in contiguous memory location. Also in order to access “n” node need to go
through the sequence “n” times. That consume some more time.
 Linked list cannot be traverse from the end. That mean can’t be accessible from the
reverse order. That is also one of the disadvantages of the linked list.
 When memory is dynamically allocated, it uses the memory from Heap. Therefore if
there is insufficient space in the heap, then it won’t allocate any memory to the list.
(Protesh, 2014)
```

Justification

Linked list was used in this system in order to implement the stack data structure. The major
advantage of linked list over array is that it can store any number of elements without a
restriction. In the array it should be define the size of array when declaring it. So the users are
limited to enter the data within that array size. User can’t add more data than the array size.
That would be decrease the user satisfaction in this system. Because the linked list was used
to create a Stack data structure which stores the password in order to perform encryption.
User should be allowed to enter maximum number of characters when they creating a
password to their account. It doesn’t mean they can enter 100 of characters. They can, but in
real world scenario they won’t remember that much of characters. So the restriction should be
not applied when creating a user account password. In that case Array cannot be used because
of its nature (Size cannot be dynamically changed). But linked list can dynamically change
according to the requirement. Also linked list helps to efficient memory management,
because the space will be allocated dynamically according to the on time requirement. That
shrinks and grows according to the requirement. Another advantage is that linked list can be
accessible easily. Also it is easy to insert and delete. Compare to the array an element can be
easily deleted in the linked list easily. Unlike array the linked list elements are connected
using a pointer. So whenever wants to place an element in the middle then simply can remove
the link and can place the new element in the middle then new link can be created. Similarly
deletion also can be done easily. For that the connection between two element need to be
removed, then relevant element can be deleted. Then need to establish a new link. But in
Array need to move elements here and there when inserting or deleting an element in middle
of the array.

The Array data structure is not suitable to this implementation because of its disadvantages.

The disadvantage of the array is that it store nearby in the memory location even though
empty spaces available on other areas of the memory. Some of the time the memory spaces
may not available in nearby. In that case storing data to the array become much difficult than
usual.


Next disadvantage of the array is insertion and deletion in middle of the array. If the size of
array is smaller then there is no big issue. But if the array contains large amount of element
then it would be very difficult task when dealing with insertion and deletion.

If the array contains 500 elements and a programmer wants to place his data on 250th element
then there should be an empty space need to be created. Also all other elements which comes
after 249th index should be moved to its next following index. Otherwise the new element
will override the old element. If so the old element will be deleted. Similarly if wants to
delete an element from 250th index, then all other elements comes after 250th index should be
move to its previous index. So this would be take more time and memory power.

By considering above points the Linked list data structure was selected to the Book rank
system. Due to the advantages of the Linked list system performs faster and much efficiently.
That can increase the user satisfaction.


### Queue

Queue is a data structure or a method to store data in a linear manner. The data which is
stored first will be taken first. This structure follows first in first out theory. That means
whatever the data or an object stored first will be processed first. When new data store into
the queue will be placed at the rear of the data structure. The deletion will be placed at the
front. The first element entered into the queue is the first element removed from the queue.

```
(Margaret, 2015)
```
Advantages

```
 Queue is a simple “FIFO” (First in First out) data structure.
 Insertion and removing data operation can be performed faster and efficiently.
Because in the Queue the new element will be added to the end of the queue and the
removing process will be done to the front of the queue. Therefore those operations
can be performed quickly and efficiently.
 When multiple clients are accessing a service that should be organized with the queue
data structure. In such cases queue data structure are highly used.
 Circular queues: - Queues can create empty spaces in the array. Circular queues can
be used to utilize the empty spaces of a queue array.
 Queues will free up process from performing certain task. That can increase the
system performance in certain action. Also that can lead to improve the overall
performance of the system.
 The restriction of the queue will give some advantages. For an example queue can be
used to response customer enquiries. So the first customer whoever post an enquiry
will get response first. (Robert, 2011)
```

Disadvantages

```
 Queue cannot be readily searchable.
 Insert and delete nodes (Elements) from the middle of the Queue would be difficult.
 Empty spaces will be created when an element was deleted. If the element was placed
on the middle then there is empty space created in the middle.
 Only can get data first whatever stored first.
 Insertion only possible through the sequence of flow. Can’t add any data in the
middle.
 Difficult to maintain and manipulate.
 Randomly can’t be accessible.
 Consumes more memory space, because it required storing pointers.
(Robert, 2011)
```
Justification

Queue data structure is not used in the book rank system. Queue data structure follows “First
in First out” theory. So whatever data entered into the queue will be produced as it is.
Password encryption method should be reversing the password characters order. That cannot
be achieved with the Queue data structure. Instead of Queue data structure Stack can be used.
Because it uses “Last in First out” theory which will reverse the password characters order.
Also this cannot be usable when retrieving password from the database to a relevant function
(Confirm password), because it should be arrange the password in a correct format. So these
actions are not possible with the Queue data structure. Therefore Queue data structure was
not used in the book ranking system.


### Stack

Stack is a data structure where items are removed in the reverse order from that in which they
added. Stacks are limited access data structure that means elements can be added and
removed from the stack only at the top. When a new item comes in, that pushes down the old
items which are already stored. So the most recent added item is the first one processed or
removed. This follows “last in first out” theory. Adding new item knows as “pushing” and
removing is called “popping”. (Margaret, stack, 2005)

Advantages

```
 Stack is a simple “LIFO” (Last in First out) data structure.
 Insertion and removing data operation can be performed faster and efficiently.
Because in the Stack the new element will be added to the front of the queue. Also the
removing process will be done to the front of the stack. Therefore those operations
can be performed quickly and efficiently.
 Easy to understand and implement.
 Stack can be used to manage methods at run time on an application. Most of the
compilers are using stack algorithm to store and return the value of variable as well as
the parameters in a methods when that method is called. Similarly in many cases
Stacks are highly used.
```
Disadvantages

```
 Stacks cannot be readily searchable.
 Insert and delete nodes (Elements) from the middle of the Stack would be difficult.
 Empty spaces will be created when an element was deleted. If the element was placed
on the middle then there is empty space created in the middle.
 Only can get data first whatever stored last.
 Insertion only possible through the sequence of flow. Can’t add any data in the
middle.
 Difficult to maintain and manipulate. (CareerCup, 2012)
```

Justification

Stack data structure was used in the system for the purpose of implementing password
encryption mechanism. The encryption was done in a simple method which reversing the
password string characters and store it to the database. When it is retrieve from the database
that again reversed and assembled into correct format. In order to implement this method it
would be required more lines of code. But with the use of Stack data structure it was
implemented easily. The Stack is using “Last in First out” theory. When user entering a new
password that will be stored to the Stack. Then it will retrieve from the Stack. So in that time
the characters will be arranged in a reverse format. Then that will be stored to the database.
Also when it retrieved from the database, first it retrieved to the Stack, then the relevant
function (confirm password) will get it from the Stack in a correct order. These complex
logics were easily implemented with the use of Stack data structure. Also it can perform
efficiently, because retrieving and adding element to the queue are possible in one direction.
Therefore it can perform efficiently. The retrieving and adding be done quickly. So system
perform efficiently and faster when user creating an account and when user login to the
system.


## Searching algorithm

Searching algorithm is an algorithm that used to search a specific item among a collection of
items. There are a certain algorithms can be used to search a specific item. Most popular
searching algorithms are “Linear search”, “Binary search”, and “Recursive binary search”.
Each algorithm has its own advantages and disadvantages. The performance also will be
differed between each algorithm. Therefore selecting a proper searching algorithm would be
most important part in a development process.

### Linear search

Linear search is a simple and sequential searching algorithm which uses a loop to step
through an array. The loop will be starting from first element of an array and continued until
find the searched data. Comparison was done to each element with the value being searched
for and the looping stops when either value is found or the maximum size of the array is
encountered. (Skeet, 2009)

Advantages

```
 Simple – Simple and easy to understand. Compare to binary search few lines of codes
will be written.
 The code and the implementation are straight forward so easily can understand by any
programmer.
 Linear search consumes fewer resources.
 This search does not require the data to be stored in an order. Equally perform in both
the situation. This would be biggest advantage of this method. (Skeet, 2009)
```
Disadvantages

```
 The algorithm has to look and compare until last element in order to search a data in
the last element. In a business environment there might be at least 10,000 records will
be found in a selected area. So if the searched record found in last element of an array,
then the algorithm will have to look at all 10,000 records. It will decrease the server
performance. Also that will decrease the all other connected client service
performance as well. So this search is inefficient.
 Number of comparison is high compared to binary search. (wordpress, 2010)
```

### Binary search

Binary search is a searching algorithm. This used to finds the position of a specified input
value within an array which is already sorted. In order to use this search the relevant array
should be arranged in an ascending or descending order. The algorithm compares the
searched value in each step with the middle value of an array. The comparison will be done
until finds the searched value. If the key match, then that will be returned. If the searched key
is lesser than the middle element, then the searching action will be continued on the sub-array
to the left of the middle element. If the searched key greater than the middle element the
searching action will be continued on the sub-array to the right of the middle element. The
algorithm returns “not found” message when the array to be searched is empty.

(Rodger, 2003)

Advantage

```
 Straight forward and simple construction algorithms.
 Efficient
 Less comparison
 Efficiently work with large set of data. Because in each loop the algorithm cut of the
list to be search by half.
 Easy to understand. Therefore programmers feel comfortable when updating the
system. Also it is lead to good maintainability.
 Accuracy is high. In order to implement binary search it is required to sorting the list
to be searched. Therefore the result will be more accurate. (Trims, 2014)
```
Disadvantage

```
 The method can be applied only to the array which stored data in a particular order.
 This takes some more time compare to linear search because it requires finding the
middle element (mid-term) before starting the comparison.
 If the array not sorted properly, then the searching algorithm works incorrectly and
returns a wrong value and it takes long time.
 The algorithm takes too much time in order to find the first or the starting elements of
an array (ex: Index 0, 1, 2, 3) compare to linear search.
```

Justification

Binary search is selected to the given scenario. Advantages and disadvantages were
considered in order to select searching algorithm. The binary searching algorithm has
fabulous advantages that makes system much efficient as well as gives accurate output. The
binary search algorithm requires fewer resources to be used. Because less memory as well as
processor power are required to perform it action compare to other searching algorithm.
Because binary search will first identifies the mid element then perform comparison.
Therefore in each time the size of the element to be checked will be reduced by half. But
linear search checks each element of an array with the searched key. That may requires more
resources compare to binary search.

The binary search is easy to understand. Because it uses simple lines of code which can be
easily understand by any programmer. Therefore maintainability is higher. That is very
helpful when the code is analyzed by another programmer for the purpose of upgrading. And
the implementation also much easier compare to binary search.

Also the output will be very accurate and straight forward. Binary search requires all the
values of the element should be organized based on particular order. Therefore the result will
be much accurate.

The binary search is more effective than linear search especially with the large set of element
or data. In each time the list will be divided into two sections (half) and one section will be
searched until finding the result. First it finds the mid- point and checks with the search key.
If the result matches it returns the results. If the mid-point is lesser than the search key, then
the searching will be begin from the mid-point to right section of the list. In the right section
it will find the mid-point. And the searching will continued same as before. Likewise it will
cut off the list by half in each time of search. That would be more beneficial with the large
amount of data. The searching time will be reduced and the resource utilization will be
controlled. But the linear search start at the beginning of the list and checks all the elements
one by one until find the result. That would be worst case with the large set of data.


Another advantage of the binary search is that, it requires a sorted list. So the result will be
more accurate as well as the function can perform more effectively. Also the resource
consumption will be reduced. That may increase the consistency of system.

Since its nature the binary searching algorithms are much faster. That gives a big speedup to
the system. So the operations such as retrieving and storing data to the database will be done
in efficient way. That gives speed to the system as well.

Similarly linear search contains many disadvantages. This search requires large amount of
time and resources compare to binary search. Because it has to check all the element of the
list until find the result. The number of comparison would be high compare to binary search.
Therefore the system can perform slower with the large amount of data. The database
operation such as retrieving and storing data will be delayed due to nature of the linear
search. That can decrease the user satisfaction. By considering these points the linear search
algorithm would be better selection to the book ranking system and that increase the
performance as well as the efficiency of the system. (schani, 2010)


## Sorting algorithm

Sorting algorithms are used to ordering a list of objects. These algorithms put elements of a
list in a particular order. The most popular ordering methods are numerical order. Other
algorithms such as searching and merge algorithms are required to be element sorted properly
in a selected order. Also sorting will increases the system performance and efficient. For an
example if the elements are ordered in a proper way then it would be easy perform certain
task such as search and merge. Also the resource consumption is also reduced. The sorting
typically categorized into two types.

Internal sorting- The number of objects is small enough to fits into the main memory.

External sorting- The number of objects is so large that some of them stored on external
storage during the sort.

In Place sort- Space requirement is constant with the input data size.

### Bubble sort

Bubble sort is an internal sorting method. This sorting algorithm is easy to understand. The
sorting process was done using a loop. In each loop the values of two adjacent items in the
array are compared, if the “right” value lesser than “left” value, then the items will be
swapped. Such a way the lesser value goes downward. That mean the smallest value items
sink to the bottom of the array. Such a way it will sort all the element of a list. This process
continued until there are items in the array. During the sorting process a temporary will
created which used to hold the value of “left” element which needs to be swapped. Otherwise
the “right” element will override the “left” element. That which leads to data lost.
(Tempel, 2008)


Advantages

```
 Bubble sort is very simple. The algorithm simply compares the adjacent items, and
swapping them.
 It is very popular.
 Easy to understand.
 It takes only few lines of code
 The data is sorted in place. Therefore it consumes so little memory. No additional
temporary memory is required.
```
Disadvantage

```
 Bubble sort is inefficient.
 Time consuming is high. It takes more time to sort. Because it perform too much
comparison and swapping.
 Not recommended for long searches. That means if the list to be search contains large
set of data then bubble sort become inefficient.
 The number of looping and the comparison is high compare to others.
 Resource consumption was high with the large set of data.
 Bubble sort cannot be easily implemented. Therefore it would be difficult to maintain
and update. (Leander, Advantages & Disadvantages of Bubble Sort, 2011)
```

### Insertion sort

Insertion sort is an algorithm which ordering unorganized elements into a particular order.
The algorithm selects smallest unsorted elements and then compare with the next item then
swaps if necessary. In each loop single comparison and swapping will be done. The process
will be continued until the entire list gets sorted. This algorithm also uses temporary location
to store the value of an element same like bubble sort.

(Chegg Inc, 2014)

Advantages

```
 Insertion sort can be implemented easily. Also it is simply can code.
 Very good performance with small amount of data. Also it can perform well with the
large list.
 This algorithm performs well when the list is almost sorted. That means if the list is
partially sorted then the algorithm need to perform only few compares and swapping
in order to entirely sort the list.
 Much more efficient than other sorting algorithm. Because it perform less number of
comparison and swapping. Therefore it consumes fewer resources. Also it only needs
one temporary space to hold swapping element.
 Insertion sort is an in-place sorting algorithm. So the space requirement for the
process would be minimal. That can increase the performance and efficiency of the
system.
```

Disadvantage

```
 If the list was reverse ordered, that would be worst case.
 Insertion sort is does not suit with high systems.
```
```
(Wandy, The Advantages & Disadvantages of Sorting Algorithms, 2014)
```
### Selection sort

The selection sort is algorithm for sorting items. The algorithm selects the minimum value in
the array and swaps it with the first element. Then it checks the smallest value in the
remaining array (Without the first element, because that was already sorted). Once it found
that will be swap with the second element of the array. Then checks for smallest element in
the remaining array (Array without first and second element, because those already sorted)
and swap it with the third element, and so on. This action will be performed up to last
element of the array. (Miller, 2014)

Advantages

```
 Selection sort will perform well on a small list.
 This is also an in-place sorting algorithms. Therefore it not consumes many resources.
```
Disadvantages

```
 The algorithm is poor in efficiency.
 It is inefficiency with huge list.
 It takes more time compare to insertion sort.
 This algorithm is low in scale.
 Too much comparison will be done compare to insertion sort.
 Number of loops are high compare to insertion sort.
 In some case it is only suitable for small list that contains elements in random order.
(Wandy, The Advantages & Disadvantages of Sorting Algorithms, 2009)
```

Justification

The insertion sort is selected to Book rank system. This algorithm increases the system
performance as well as the efficiency compare to other two sorting algorithms.

Insertion sort is very much efficient and adaptive. Because this algorithm performs less
number of swapping compare to other searching algorithms. Therefore it increases the
efficiency of the system. Also the sorting process will be done in efficient manner as well as
faster. That would be very beneficial and work much effectively when system contains large
amount of data.

The insertion sorting utilizes the memory in much effective manner. It performs less number
of swapping and comparison unlike other sorting algorithms. A temporary variable is
required to the swapping process to hold the data. So if the number of swapping are high, that
mean the memory usage is increasing. So that can decrease the system performance. Also this
can cause to some serious problems when working with large set of data. But the insertion
sort is best in memory utilization (because the numbers of swapping are lesser compare to
other two sorting algorithms). That can result to better performance of the system.

Another advantage would be there are less number of comparisons will be done. That is also
increases the system performance as well as efficiency. Book rank system connects with the
database. So the records will be stored and retrieved from the database. Those processes also
will be done efficiently due to the characteristics of insertion sort.

The selection sort has many disadvantages compare to linear search. Efficiency of the
selection sort would be poor with a list containing many elements. The book ranking system
might be containing thousands of records. In that case the selection sort can decrease the
system performance. The selection sort performs lot of comparison compare to the insertion
sort. Another disadvantage of the selection sort is that it requires some additional memory
space to hold the result in each loop of the sorting. So that can decrease the efficiency of the
system. Also that can decrease the system performance and delay the process of data retrieve
from database. If so the entire system will be delayed.


The bubble sort performs lots of comparison as well as swapping compare to insertion sort.
Also it is not comfortable with a list containing large set of data. It has to perform a number
of steps in order to sorting the element. That can consume much resource. Also the efficiency
of the system will be reduced, because the sorting should be done to the database record. So
those records should be retrieved from the database. Also it should be send back to the
database after the sorting process was completed. These actions can be delayed due to
behavior of bubble sort (lot of comparison and swapping). That can decrease the system
performance and the efficiency. The bubble sort will be suitable for small system which
contain small amount of data. It’s not suitable for this system.

By considering the above points the Insertion sort is selection to the book rank system.


## Error handling

Error handling is one of the most important area in system development process. There are
two types of errors can be generated during the development process. One type is syntax
errors. Syntax errors are occurred because of misspelling in the lines of code. That mean
missing a semi colon (;) at the end of the statement will lead to a syntax error. In this time the
code analyzer will identifies there is an error in the lines of code. Until fix the errors compiler
won’t compile the program. This can be easily fixed.

Second types of errors are more considerable errors. Those errors cannot be detected while
developing the program. They come out when the program running. Those are called runtime
errors. In some time those errors may not related to the system. But it will cause to program
crash. For an example when a system dealing with a database server, if the database server
goes down it may not related to the system. But it will lead to runtime errors in the program.

These errors will completely crash the program. Those errors need to be handled in a proper
way. In order to handle those errors, Try catch blog can be used. In the book rank system
several try catch blog was used. Some of the examples were given in the below.

Figure 1 :Error handling 1

This try catch blog was implemented in RefBookDC. This method is used to delete the
relevant reference book details from the database. In here SQL exception are the expected
errors. That mean those errors are related to the database. Whenever an error was occurred it

## will catch and showing an error message instead of crashing the program.


```
This try catch blog also will catch the database related errors. This was implemented in
UserDC class. This function will retrieve a relevant user detail from database. If any errors
occurred related to the database, then try catch blog will catch that error and show that error
to the user instead of crashing the program.
```
Figure 2 : Error Handling 2


### Validation

Validating the system is also one of the essential in system development process. It will
increase the usability of the system. Also it reduces ambiguities of the system. Validation is
the process which makes aware the users. Users don’t know about the system, regarding what
should be inserted to the system in order to perform certain task. Therefore relevant message
should be printed in order to notify the users about their incorrect moves on the system. in
this system the validation function was implemented which identifies what inputs should be
given to perform relevant operation. The above image is one of the examples for validation in
book ranking system. When user try to login without entering user ID, a message box will
appears and displays “User id is required fields”. Such a way most of the function was

## validated in the book ranking system.

```
Figure 3 : Validation
```

## Recursive algorithm

Recursion algorithms are the algorithms which used to solve the problems by breaking a
problem in to smaller and smaller sub problems until it can be small enough to solve. It can
be able to solve one of these smaller problem and then can able to build up the solution to the
whole problem. Recursion is the process a function calling itself. That means applying the
same algorithm to each piece of smaller problem and combining the result. Recursive
algorithms allow user to write solution that would be very difficult to write solution in other
methods. (Kenneth, 2006)

Advantages

```
 Easy to write and implement. Iteration algorithms are more complex then recursive
algorithms. Therefore recursive algorithms are understandable then iterative
algorithms. Also it’s very readable. That makes system more maintainable and
reliable.
 Recursive algorithms are very understandable and less complex. Due to that it is very
easy to debug. In massive system it would be a most considerable advantage.
 Avoidance of unnecessary calling of functions. That would be increase the efficiency
of the program.
 Recursion algorithms are more suitable where iterative solutions are become more
complex. One of the good practices in programming is that making code more
understandable. Also the lines of code can be reduced efficiently due to the use of
recursive algorithms.
 Recursive solution can be used where the solution is expressed in terms of applying
the same solution. This can work efficiently and increase the system reliability and
efficiency.
 Recursion algorithms used to solve most of the problems in efficient manner. In some
situation it must require to use recursion algorithms. Ex: A function that can use to
display a list of all files of a system.
 Recursion algorithm is very flexible in some of the data structures such as binary
search, stack, and queues. (milller, 2013)
```

## Recursion binary search

Recursive binary search is a searching algorithm and this is an implementation of binary
search algorithm that uses recursive method calls, mean a function called inside the same
function. This method can be used instead of searching the value iteratively. The recursive
search algorithm maintains the same range as a parameter to the function. The final breaking
condition will be checked first to stop the recursion, otherwise the program get into an
infinitive recursive regression. In each time when the function is called the size of the list will
be reduced. That mean it gradually produce smaller version of each time.

Advantages

```
 Easy to write and debug. Also binary search with the recursive method would be
intuitively clear. It makes far more effective. So the programmers feel comfortable in
implementation, maintenance and update.
 Recursive algorithm gives easy and straight forward solution to the binary search
implementation.
 Lines of code are less compare to iterative binary implementation. That would be
increase the reliability of the program.
 Simple and faster. Thus it increases the efficacy of the system.
 The recursive binary search function is relatively sorter. That also helps to better
understanding of the code and better maintenance.
 The recursive binary search works more efficiently and effective than binary search.
Because the recursive algorithms are more effective where the solution is expressed in
terms of applying the same solution. In the binary search same logic need to be
repeated again and again. So with the recursive method, that can perform far more
effective. (Bhatta, 2013)
```

## String Class

String is one of the fundamental of many programming languages in current date. Correct
understanding of String class is crucial for every programmer especially in object oriented
world. String is a very special class in many programming languages, and also it is most
frequently used in every program. String is not a primitive data type like float or long. It is a
class in other word String is a user defined type. String class contains several methods which
help to develop the system in efficient and easy manner. String in object in many
programming languages (Java, C#) and backed by character array.

Strings are immutable in object oriented programming languages such as Java and C#. That
mean the content of the String cannot be modified after it was created. Even that can be
modified using some of the method of String class like “toLowerCase(), toUpperCase()” or
any other. But that will result in new String.

String is final in object oriented programming languages. This mean String cannot be extend
or override any of its functionalities. Also all Strings literals (like ”abc”) are stored in
separate String pool. In Java it maintained in special memory location inside Java memory
called “PremGenSpace”. When creating a new String literal, Java virtual machine checks the
String in pool if that String is already present in pool than the same object will be returned
instead of creating a new object. (Paul, 2013)

There are several string function can be found in Java. Some of the popular and frequently
used functions were discussed in below.

1. length() : - Assessor methods are used to obtain information about an object.
    “length()” method can be used with String in order to identify the number of
    characters contained in an String object.
2. compareTo() : - This method compare two string objects based on the Unicode value
    of each characters in those objects.
3. compareToIgnoreCase() : - This method compare two String objects lexicographically
    and ignores case differences. It works same as compareTo() method, but it does not
    consider the case. (case insensitive)
4. concat() : - This method concatenates the specified string to the end of this another
    string.


5. char charAt(int index) : - This method returns the character at the specified index. The
    index should be given in input parameter
6. int codePointAt( int index) : - This method returns the Unicode code point value of
    the specified index. Does not returns the specified index character.
7. void getChars(2, 5, char[] destination, 3) : - This method copies the specified
    characters from the source array to destination array (char[] destination). The first
    parameter indicates where to start copy the characters from source array and second
    parameter shows where to end. Third parameter should be the destination array and
    forth parameter indicates where to start paste on destination array.
8. equals() : - This method compares the string with the specified string and returns a
    Boolean value. If the both string are same then it returns “true”, otherwise “false”.
9. contentEquals(StringBuffer strBfr) : - This method also perform same as equals(). It
    compares the string to the specified string buffer and returns a Boolean value.
10. equalsIngoreCase() : - This method compares two strings. It works same as equal()
    method. But unlike equals() this does not consider the case.
11. valueOf(data type) : - This method returns a string representation of specified data
    type (input parameter).
12. matches(string regular_expresion) : - This method checks whether the string is
    matching with the given regular expression or not and returns a Boolean value (either
    “true” or “false”).
13. toCharArray() : - This method converting the string to a “char” array (character
    array).
14. copyValueOf(char [] myArray) : - This method taking an character (char) array (input
    parameter) and returns a string that contains the characters of that array.
15. substring(int beginIndex, int endIndex) : - This method returns substring of a string.
    That substring will starts with character at first parameter (beginIndex) and end with
    the character at second parameter (endIndex). This method has two method overloads.
    First method overload is that this method can be used by giving only one parameter.
    So that will be the starting point of character at the original string.
16. lastindexOf() : -This method returns a integer value that indicates the last occurrence
    of string.
17. indexOf(String strn) : - This method returns a integer value that indicates the first
    occurrence of specified substring.


18. endsWIth(String str) : - This method returns a Boolean value that mean “true” if the
    string ends with the specified suffix. If not it returns “false”.
19. getByte(String charSet) : - This method converts the String into sequence of bytes
    using the named char set encoding then storing the result into a new byte array and
    returns it.
20. hashCode() : - This method returns the hash code for the relevant String.
21. replace(char old, char new) : - This method replaces all occurrence of “old” String
    with “new”.
       (tutorialspoint, 2014)


## Implementation of String operations

if(a[curIn].getBookID().equals(searchKey))

This examples shows how “equals()” function was implemented in book rank system. This
function was used in “recFind()” method in “ArrayRankBook.BL”. This method is to search
a relevant record with a search key in an array which stored ranked book details. This method
checks whether the two Strings (Book ID and Search key) have same characters or not. If the
both Strings are same and no difference is found in characters and length of string, then the
“equals()” method returns “True”. If any difference found in characters or length of string, it
will return “false”.

if(a[curIn].getBookID().compareTo(searchKey)<0)

This function also used in the same “recFind()” method in “ArrayRankBook.BL”. This
function compares two String objects. In this case it compares Book ID and search key. If
both strings are lexicographically equal then this function returns 0. And if Book ID is
lexicographically greater than search key, then it returns an integer value which is greater
than 0. If Book ID is lexicographically lesser than search key, then it returns an integer value
which is lesser than 0. (tutorialspoint, 2013)

if (txttitle.getText().equals (""))

This “if” condition was implemented in validation function. This condition checks the
contents of the title text field in the Book frame UI. The equals() method checks and return
“true” if the text field is empty or does not contain any value. And if text field contains any
value this method returns “false”.

if (txtauthor.getText().equals (""))

This “if” condition also works as same as above “if” condition. If the author text field is
empty then it returns “true”. Otherwise it returns “false”.


String PaymentStatus=String.valueOf(cmbpaymentstatus.getSelectedItem());

String.valueOf() function was used in “Borrowing Frame”. A string variable was created
named “PaymentStatus”. This variable going to hold the data from a combo box called
“cmbpaymentstatus”. getSelectedItem()) method was used to get data from combo box. This
method returns an object. Object cannot be stored in a string variable. So the object should be
in a string format in order to store that data in “PaymentStatus”. In order to do that work a
string function was used here ( String.valueOf() ). String.valueOf() method returns a string
representation of the given object. That can be stored to that string variable.


## Testing......................................................................................................................................

Testing is the most important part in software development life circle (Agarwal, 2014).
Software developing life circle not going to be success without testing. All the software’s or
applications should be tested in each and every stages or at the end. This is the most
important part because this test process will revealed the mistakes and the bugs of the
program and help to correct it. The testing process gets repeated until the program becomes
100% perfect. Without testing cant ensure the program results. Program results and outputs
should be met with customer requirements. And actual test results should be match with
expected test results. Then only the program will be handover to the user.

The various levels and types can be found in testing process.

Testers are using different methods to test the particular program in different environment.
Program should be tested after finishing or the developing period. Otherwise program cant
fulfills the customer expectation.

There are few techniques to find the errors and the bugs in the program and how the program
is working. Basic ones are black box testing and the white box testing (wordpress, 2012).

01. Unit testing
     White box testing
     Black box testing
02. Integration testing
03. System Testing
04. Function Testing
05. Acceptance testing


### Unit Testing

As it mentioned in (Viklund, 2013) this is the object level testing. In this level particular
software modules (functions) are checked for any errors. Tester should have an accurate
knowledge of the program for this test. This test is also known as lowest level test. In this unit
test testers are testing the basic unit (modules) of the software. This test is typically done by
the programmer. They check whether each functions outputs are perfectly working or not.
Under the Unit test two categories available.

1.0 White box testing
2.0 Black box testing

### Integration Testing

After the Unit test the individual modules are integrated together and that module will be
tested for finding the faults. That test is called as “Integration Testing”. Unit testing is tests
every modules one by one within the program. That not considers about the whole program.
Because when those single modules are combine together then some bugs and errors can be
occurs. So in that part integration test will be conducted.

### System testing

In this test entire system is tested for finding the errors and the bugs of the program. In here
the hardware and the software components will be tested are those suitable to the program or
not. This test is listed under the black box testing. In here tester will be check where the
software is works for user expected working conditions.

This test often based on the functional/requirement specification of the system. And some of
other options also considered (Non-functional quality attributes, such as reliability, security,
and maintainability). (Exforsys, 2006)


### Acceptance Testing

This test is done before software going to be handed over to the customer. In this test tester
will consider on the entire program and its process. Tester will be ensure that the developed
program is fulfills all the client requirements. This test is further classified in to two parts.

01 Internal Acceptance Testing. (Alpha testing)

```
This test is conduct by the member of development team. Usually this test is made before
the program released to end users. This test is comprised of both black box testing and the
white box testing. (Viklund, 2013)
```
02. External Acceptance Testing (Beta testing).

```
This test is carried by the end users. This test is done after the alpha testing. The
developed software released to the end user, after that user suggestion and the feedbacks
will be collected. According to that development team ensure the validity of the software.
Normally this test is done by the end user, therefore this also known as black box testing.
```
### Regression testing

The particular program can be changed after developing was done according to the user
requirements. In that case the existing software was already tested. But have to ensure that
the new changes aren’t affecting the existing functionalities. For that this regression testing
will be done.

### Smoke Test...........................................................................................................................

This test is conduct by the test manager. In this test tester will identify the environment
related problems. Tester has to ensure the smoothest running of the program in the
environment. So the program should be checked whether it’s running on the environment
without any problems or not. These things are considered on smoke test (Viklund, 2013).

Therefore the entire program will be checked. So the software will be a greatest solution for
the given problem. Therefore this unit test has been decided as a testing method for this
software.




## Reference

Array. (2013, - - ). Retrieved 05 27, 2015, from xpode:
[http://xpode.com/ShowArticle.aspx?ArticleId=502](http://xpode.com/ShowArticle.aspx?ArticleId=502)

Agarwal, C. (2014). 6 Different Types of Software Testing Methodologies. Retrieved 02 17,
2015, from [http://click-labs.com/6-different-types-software-testing-methodologies/](http://click-labs.com/6-different-types-software-testing-methodologies/)

Bhatta, D. (2013, 4 9). Advantages of recursion. Retrieved 06 03, 2015, from
letsleancomputing: [http://letslearncomputing.blogspot.com/2013/06/advantages-and-](http://letslearncomputing.blogspot.com/2013/06/advantages-and-)
disadvantages-of.html

CareerCup. (2012, - - ). stack disavantage. Retrieved 05 30, 2015, from career cup:
[http://www.careercup.com/question?id=13083663](http://www.careercup.com/question?id=13083663)

Chegg Inc. (2014). Definition of Insertion Sort. Retrieved 6 8, 2015, from
[http://www.chegg.com/homework-help/definitions/insertion-sort-](http://www.chegg.com/homework-help/definitions/insertion-sort-) 3

Defuse Security. (2014, 8 6). Salted Password Hashing. Retrieved 06 10, 2015, from
crackstation: https://crackstation.net/hashing-security.htm

Exforsys. (2006). Types and Levels of Testing in Programming. Retrieved 02 20, 2015, from
[http://www.exforsys.com/tutorials/programming-concepts/types-and-levels-of-testing-](http://www.exforsys.com/tutorials/programming-concepts/types-and-levels-of-testing-)
in-programming.html

Farcic. (2013, 12 11). White box. Retrieved 06 07, 2015, from technologyconversations:
[http://technologyconversations.com/2013/12/11/black-box-vs-white-box-testing/](http://technologyconversations.com/2013/12/11/black-box-vs-white-box-testing/)

geekboots. (2013). Insertion Sort. Retrieved 6 8, 2015, from
[http://www.geekboots.com/datastructure/insertion-sort](http://www.geekboots.com/datastructure/insertion-sort)

Kenneth. (2006, - - ). Recursion. Retrieved 06 02, 2015, from wustl:
[http://www.cse.wustl.edu/~kjg/cse131/Notes/Recursion/recursion.html](http://www.cse.wustl.edu/~kjg/cse131/Notes/Recursion/recursion.html)

Krishna. (2008). Advantages and Disadvantages of Black Box and White Box Testing.
Retrieved 05 18, 2015, from
[http://creativetesters678.blogspot.com/2008/07/advantages-and-disadvantages-of-](http://creativetesters678.blogspot.com/2008/07/advantages-and-disadvantages-of-)
black.html


Leander, R. (2011, - - ). Advantages & Disadvantages of Bubble Sort. Retrieved 05 27, 2015,
from eHow: [http://www.ehow.com/info_8201350_advantages-disadvantages-bubble-](http://www.ehow.com/info_8201350_advantages-disadvantages-bubble-)
sort.html

Leander, R. (2013). Advantages & Disadvantages of Bubble Sort. Retrieved 6 8, 2015, from
[http://www.ehow.com/info_8201350_advantages-disadvantages-bubble-sort.html](http://www.ehow.com/info_8201350_advantages-disadvantages-bubble-sort.html)

Margaret. (2005, 04 -). stack. Retrieved 05 29, 2015, from techtarget:
[http://whatis.techtarget.com/definition/stack](http://whatis.techtarget.com/definition/stack)

Margaret. (2015, 4 -). Queue. Retrieved 05 28, 2015, from techtarget:
[http://whatis.techtarget.com/definition/queue](http://whatis.techtarget.com/definition/queue)

Miller, B. (2014, - - ). Selection sort. Retrieved 06 02, 2015, from interactivepython:
[http://interactivepython.org/runestone/static/pythonds/SortSearch/TheSelectionSort.ht](http://interactivepython.org/runestone/static/pythonds/SortSearch/TheSelectionSort.ht)
ml

milller, B. (2013, - - ). Recursion. Retrieved 06 02, 2015, from interactivepython:
[http://interactivepython.org/courselib/static/pythonds/Recursion/recursionsimple.html](http://interactivepython.org/courselib/static/pythonds/Recursion/recursionsimple.html)

Moobler. (2009). What are advantages and disadvantages of selection sort? Retrieved 6 8,
2015, from
[http://www.answers.com/Q/What_are_advantages_and_disadvantages_of_selection_s](http://www.answers.com/Q/What_are_advantages_and_disadvantages_of_selection_s)
ort

Paul, J. (2013, 7 17). String class. Retrieved 06 04, 2015, from Javarevisited:
[http://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-](http://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-)
beginners-programming.html

Pranav. (2012, 05 31). Bucket sort. Retrieved 06 10, 2015, from wordpress:
https://pbalasundar.wordpress.com/2012/05/31/bucket-sort/

Protesh. (2014, - - ). Linked list. Retrieved 05 28, 2015, from c4learn:
[http://www.c4learn.com/data-structure/linked-list-advantages/](http://www.c4learn.com/data-structure/linked-list-advantages/)

Robert, C. (2011, 03 -). The Advantages of a Queue in Data Structure. Retrieved 05 29, 2015,
from eHow: [http://www.ehow.com/info_8763624_advantages-queue-data-](http://www.ehow.com/info_8763624_advantages-queue-data-)
structure.html


Rodger, J. (2003, - - ). Algorithms and Efficiency. Retrieved 06 01, 2015, from research.cs:
[http://research.cs.queensu.ca/home/cisc121/2006s/webnotes/search.html](http://research.cs.queensu.ca/home/cisc121/2006s/webnotes/search.html)

Rouse, M. (2012, - - ). Data Structure Definition. Retrieved 05 27, 2015, from techtarget:
[http://searchsqlserver.techtarget.com/definition/data-structure](http://searchsqlserver.techtarget.com/definition/data-structure)

S.Adamchik. (2009, - - ). Linked Lists. Retrieved 05 27, 2015, from cs.cmu.edu:
[http://www.cs.cmu.edu/~adamchik/15-](http://www.cs.cmu.edu/~adamchik/15-)
121/lectures/Linked%20Lists/linked%20lists.html

schani. (2010, 4 30). Linear vs Binary. Retrieved 06 01, 2015, from wordpress:
https://schani.wordpress.com/2010/04/30/linear-vs-binary-search/

Skeet, J. (2009). What is the difference between Linear search and Binary search? Retrieved
5 5, 2015, from [http://stackoverflow.com/questions/700241/what-is-the-difference-](http://stackoverflow.com/questions/700241/what-is-the-difference-)
between-linear-search-and-binary-search

sparknotes. (2011). Selection Sort Problems. Retrieved 6 8, 2015, from
[http://www.sparknotes.com/cs/sorting/select/problems.html](http://www.sparknotes.com/cs/sorting/select/problems.html)

SQA. (2008). Bubble Sort. Retrieved 6 8, 2015, from [http://www.sqa.org.uk/e-](http://www.sqa.org.uk/e-)
learning/ArrayDS03CD/page_09.htm

Studytonight. (2014). Insertion Sorting. Retrieved 6 8, 2015, from
[http://www.studytonight.com/data-structures/insertion-sorting](http://www.studytonight.com/data-structures/insertion-sorting)

teach-ict. (2014). Insertion Sort. Retrieved 6 8, 2015, from [http://www.teach-](http://www.teach-)
ict.com/as_as_computing/ocr/H447/F453/3_3_5/data_structures/miniweb_search/pg7.
htm

Tempel, T. (2008, 10 12). Bubble sort. Retrieved 05 25, 2015, from hermann:
[http://www.hermann-gruber.com/lehre/sorting/Bubble/Bubble-en.html](http://www.hermann-gruber.com/lehre/sorting/Bubble/Bubble-en.html)

Trims. (2014). What are advantages and disadvantages of linear search? Retrieved 5 5,
2015 , from
[http://www.ans.com/Q/What_are_the_disadvantages_of_using_a_Binary_Search](http://www.ans.com/Q/What_are_the_disadvantages_of_using_a_Binary_Search)

tutorialspoint. (2013, - - ). CompareTo. Retrieved 06 06, 2015, from Java string:
[http://www.tutorialspoint.com/java/java_string_compareto.htm](http://www.tutorialspoint.com/java/java_string_compareto.htm)


tutorialspoint. (2014, - - ). Java - Strings Class. Retrieved 06 05, 2015, from tutorialspoint:
[http://www.tutorialspoint.com/java/java_strings.htm](http://www.tutorialspoint.com/java/java_strings.htm)

Vangie, B. (-, - - ). Disadvantages of array. Retrieved 05 27, 2015, from wepopedia:
[http://www.webopedia.com/author/Vangie-Beal](http://www.webopedia.com/author/Vangie-Beal)

Viklund, A. (2013). Software Testing Types. Retrieved 2 18, 2015, from
[http://www.aptest.com/testtypes.html](http://www.aptest.com/testtypes.html)

Wandy, J. (2009, - - ). The Advantages & Disadvantages of Sorting Algorithms. Retrieved 06
02, 2015, from eHow: [http://www.ehow.com/info_8446142_advantages-](http://www.ehow.com/info_8446142_advantages-)
disadvantages-sorting-algorithms.html

Wandy, J. (2012). The advantages and disadvantages of Selection sort. Retrieved 6 8, 2015,
from [http://www.ehow.com/info_8446142_advantages-disadvantages-sorting-](http://www.ehow.com/info_8446142_advantages-disadvantages-sorting-)
algorithms.html

Wandy, J. (2014, - - ). The Advantages & Disadvantages of Sorting Algorithms. Retrieved 05
27, 2015, from eHow: [http://www.ehow.com/info_8446142_advantages-](http://www.ehow.com/info_8446142_advantages-)
disadvantages-sorting-algorithms.html

wordpress. (2010). Linear vs Binary Search. Retrieved 5 5, 2015, from
https://schani.wordpress.com/2010/04/30/linear-vs-binary-search/

wordpress. (2012). Types of Software Testing _–_ Complete List. Retrieved 2 24, 2015, from
[http://www.testingexcellence.com/types-of-software-testing-complete-list/](http://www.testingexcellence.com/types-of-software-testing-complete-list/)

WordPress. (2012). What is the purpose and importance of test plans in software testing?
Retrieved 02 24, 2015, from [http://istqbexamcertification.com/what-is-the-purpose-](http://istqbexamcertification.com/what-is-the-purpose-)
and-importance-of-test-plans/




