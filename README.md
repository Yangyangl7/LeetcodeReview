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

122 Best time to buy and sell stock 
===================================
The question is simple, we just need to find the sum of all increasing gap in the array

15 3sum
====================================
The key point of this question is to tranform the 3 sum question to 2 sum question (deque and conquer thought). In practice, there are two trick parts. 
Firstly, when we traverse the input array, except the first one element in the array, we should check whether the current element is same as the previous one. If it is, we skip to the next one because we need to avoid same answers.
Secondly, this technique also should be used in the while loop that is located in the for loop and under the if function. Let say every time when we find the answer, we not only should put the answer in the list, but also should check whether lo++ and hi++ are the same, if it is we keep incrementing lo and hi. Finally, we also should plus one more time, since currently we just move to the last same element.

93 restoreIpAddress
====================================
The key is dfs function and the count number. The dfs function can help us get all possible IP address, but we need to split it to 1-3 digit bunch and check whether the bunch is legal. If it is not we need to add a digit to the bunch that has length less than 3. Every time we find a legal bunch, we put it in a temp stored string and record the count. When the count is equal to 4, which means there are 4 legal bunch, we need to check wether the total length is equal to the input, if is not, it is still not an answer. Otherwise, we put it in the list.

3 longestSubstring without repeating letters
====================================
Maintance of a silding window and a HashMap (character:index) can tackle the question. And in practice, we should be careful about the position of tail, do not let it go back. 
