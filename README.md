# Hungry Squirrel Game
 Java console game. There is a Squirrel in a maze collecting peanunts and almonds.

## Copyright Disclaimer / Student Warning
_I developed this project for my Java course part of the Applications Programming Certificate._

_If you're a student currently enrolled to this course feel free to review my code **but only as a reference or for study purposes.**_

***DO NOT copy my code or hand it in as yours.*** _Our instructors keep all the records of the previously delivered works and review each new project, therefore, they know when the code has been plagiarized, so, don't get in trouble._

## Project Execution Example 

```
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                           ************
***********                           ************
*                                               **
*                                               **
*                                               **
*            **********************             **
*            **********************             **
*            **********************             **
*            **********************             **
*                                               **
*                                               **
*                                               **
*****            **************           ********
************                         *************
*****                                    *********
**************************************************

Enter the Squirrel position (row , column): 1,1
Position not available. Try again!
Enter the Squirrel position (row, column): 7,23
User input accepted.
Enter commands u,d,l,r to move Up, Down, Left, and Right:
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                   ?       ************
***********                           ************
*                     @                         **
*         ?                                     **
*                                               **
*A           **********************             **
*           A**********************             **
*            **********************P            **
*           ?**********************             **
*                                        P      **
*                                               **
*                  ?                            **
*****            **************     ?     ********
************                         *************
*****          A                         *********
**************************************************


Enter command: r
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                   ?       ************
***********                           ************
*                      @                        **
*         ?                                     **
*                                               **
*A           **********************             **
*           A**********************             **
*            **********************P            **
*           ?**********************             **
*                                        P      **
*                                               **
*                  ?                            **
*****            **************     ?     ********
************                         *************
*****          A                         *********
**************************************************

Enter command: e
Invaild command, only accept one of { u, d, l, r }, try again...

// Execute commands many times
// ....

Enter command: d
!!! Squirrel ate Almond and gained 5 points (Total 5 points) !!!
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                   ?       ************
***********                           ************
*                                               **
*         ?                                     **
*                                               **
*@           **********************             **
*           A**********************             **
*            **********************P            **
*           ?**********************             **
*                                        P      **
*                                               **
*                  ?                            **
*****            **************     ?     ********
************                         *************
*****          A                         *********
**************************************************

// Hit the wall 
Enter command: l
Cannot move over a wall.
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                   ?       ************
***********                           ************
*                                               **
*         ?                                     **
*                                               **
*@           **********************             **
*           A**********************             **
*            **********************P            **
*           ?**********************             **
*                                        P      **
*                                               **
*                  ?                            **
*****            **************     ?     ********
************                         *************
*****          A                         *********
**************************************************

// Eat the poisonous cashew
Enter command: r
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                   ?       ************
***********                           ************
*                                               **
*         ?                                     **
*                                               **
*            **********************             **
*           A**********************             **
*            **********************P            **
*           @**********************             **
*                                        P      **
*                                               **
*                  ?                            **
*****            **************     ?     ********
************                         *************
*****          A                         *********
**************************************************


Squirrel ate a poisonous cashew and total points became negative -5.
The squirrel dies and the game is over.
Thank you for playing this game

// Restart the game 
// Eat all nuts
Enter command: r
!!! Squirrel ate Peanut and gained 10 points (Total 35 points) !!!
**************************************************
********************        **********************
********************        **********************
********************        **********************
***********                           ************
***********                           ************
*                  ?                            **
*              ?                                **
*                                               **
*            **********************             **
*            **********************            @**
*        ?   **********************             **
*            **********************             **
*                                               **
*                                               **
*                                             ? **
*****            **************           ********
************      ?                  *************
*****                                    *********
**************************************************


Squirrel successfully collected all the nuts. Total points 35.
Thank you for playing this game

```
