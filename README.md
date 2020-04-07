# BIT-Fenwick-tree-
Use to perform query and update operation in log(n)

Array of size n+1 is used to store tree as it is index 1 array

Complexity of BIT Tree

          Space Complexity to create a tree = 0(n)
          Time Complexity to create a tree  = 0(nlogn)
          Time complexity to update value   = 0(logn)
          Time Complexity to query          = 0(logn)
          
Advantage over Segment Tree is , BIT require array of size(n+1) while Segment require array of size(2*n)

It is mostly used to calculate range sum, xor, add, mul, etc. operations.

To query use  : x-=(x&-x) i.e remove last set bit
To update use : x+=(x&-x) i.e add last set bit
       
