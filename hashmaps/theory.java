// hashmap- it work in constant time complexity that is O(1)
// hashcode - it is just a just a way of getting an integer
// why ? -
// how it works?
// *problems
// 1. we need all element as a number (hashcode function)
// 2. hashcode may be very large ( so reduce it by hashing )
// hashing - reduce all element in table to a size m

// chaining :-it is a way to prevent the collison

// simple uniform hashing:- n=no of keys in table,  m=size of table
// load factor = α =n/m= expected key per slot
package hashmaps;

// when to use which
// open addressing- better cache performance (pointers not needed)
// chaining - less sensitive to hash functions 
public class theory {
    // hash functions
    // 1. Division method h(k)=k%m  {m- size of array}
    // m is generaly taken as a prime number but not too close to power of 2 or 10 bcz these are common in real world

    // 2. Multiplication method
    // h(k)=[(a*k)%2^m]>>(w-r)
    //  a is random number,  w is no of bits in k, m=2^r
    // a is od number & 2^w-1 < a <2^w    a is not to close to 2^w-1 and 2^w

    // universal hashing :-
    // h(k)= [(ak+b)%p]%m
    // a and b are random number  ∈[0,1,...,p-1]
    // p is large prime number




    //size of the table 
    // m= θ(n)
    // if m is small  then slow
    // if m is large then wasteful
    // idea :- start small & then grow
    // when you double the table, cost to insert n items =O(N)  "average"
    // cot to insert 1 item -O(1) --> amortized constant time  



    // open addressing :-it is the another way to prevent the collison
    // one item per slot --> m>=n
    // ** probing strategies
    // 1. linear probing   ,h(k,i)= (h(k)+i)%m
    // 2. double hashing,   ,h(k,i)= (h1(k)+i*h2(k))%m
    // if h2(k) is relative prime to m for all k




    // Uniform hashing assumption:
    // Every key is equally likely to have m! permutations
    // cost of next operation <= 1/1-α 

}
