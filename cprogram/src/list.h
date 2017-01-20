/****************************************************************************
 * list.h
 * .h file is head file
 *
******************************************************************************/


/*****************************************************************************
* Define a structure for linked list elements. *
*****************************************************************************/
//the structure ListElmt represents an indi-vidual element of a linked list
typedef struct ListElm_{
    void *data;
    ListElm_ *next;
} ListElm;


/****************************************************************************
 * define a structure for linked list
******************************************************************************/

typedef struct List_ {
    //head is a pointer to the first of the linked element
    ListElm *head;
    ListElm *tail;
    //size is the number of elements in the list
    int size;
// see how do function pointers in C work in stack overflow
// match is a member not used by linked lists but by datatypes that will be derived later from linked lists
    int (*match)(const void *key1, const void *key2);
// destroy is the encapsulated destroy function passed to list_init
    void (*destroy)(void *data);
}

/*****************************************************************************
*
*
* --------------------------- Public Interface --------------------------- *
*
*
*****************************************************************************/
/*
 */
void list_init (List *list,void(*destroy)(void *data));
void destroy (List *list);
void destroy (List *list){
   /*The list_destroy operation destroys a linked list .
    * Primarily this means removing all elements from the list.
    * The function passed as destroy to list_ init is called once for each element
    * as it is removed, provided destroy was not set to NULL.
    */
    //@todo list_size
    if( list_size())
}



void list_init (List *list,void(*destroy)(void *data)){
/*****************************************************************************
* Initialize the list.
* Initializing a linked list is a simple operation in which the size member of the list is set to 0,
* the destroy member to destroy,
* and the head and tail pointers to NULL.
*****************************************************************************/
list->head = NULL;
list->tail = NUll;
list->size = 0;
list->destroy = destroy;
}

