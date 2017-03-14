/*Louise and Richard play a game. They have a counter set to . Louise gets the first turn and the turns alternate thereafter. In the game, they perform the following operations.

If  is not a power of , reduce the counter by the largest power of  less than .
If  is a power of , reduce the counter by half of .
The resultant value is the new  which is again used for subsequent operations.
The game ends when the counter reduces to 1, i.e., , and the last person to make a valid move wins.

Given , your task is to find the winner of the game.

Update If they set counter to , Richard wins, because its Louise' turn and she cannot make a move.

Input Format

The first line contains an integer , the number of testcases. 
 lines follow. Each line contains , the initial number set in the counter.

Constraints



Output Format

For each test case, print the winner's name in a new line. So if Louise wins the game, print "Louise". Otherwise, print "Richard". (Quotes are for clarity)

Sample Input

1
6
Sample Output

Richard
Explanation

As  is not a power of , Louise reduces the largest power of  less than  i.e., , and hence the counter reduces to .
As  is a power of , Richard reduces the counter by half of  i.e., . Hence the counter reduces to .
As we reach the terminating condition with , Richard wins the game.

*/

package com.scala.practice.hackerrank

object CounterGame {
  
}