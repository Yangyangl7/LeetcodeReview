# LeetcodeReview
It's just a blog for reviewing most recent 10 problems that have been solved at Leetcode
=====================================================
121 Best time to buy and sell stock with 1 limitation
=====================================================
The question can be thought as finding the most biggest gap in the array with increasing sequence. 
At first, creating an int, say minPrice, to store the minimal Price and an int, maxPrice, to record the current maximal gap (with incresing sequence).
During traversing the array, everytime when we meet a digit below the current minimal price, we update the minPrice int and i++,
everytime when we meet a digit above the minPrice, we check whether the current price minus with current minPrice can create a new maximal
number that is bigger than current maxPrice, if so, we update it, otherwise, we just i++.

===================================
122 Best time to buy and sell stock 
===================================
The question is simple, we just need to find the sum of all increasing gap in the array
