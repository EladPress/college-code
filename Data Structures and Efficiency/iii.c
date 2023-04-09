#include <stdio.h>
#include <stdlib.h> 
#define BOOL int


typedef struct List_Node
{
	int data;
	struct List_Node* next;
} Node;

typedef struct List
{
	Node* head;
}
List;

List* create_list() {
	List* lst = (List *) malloc(sizeof(List));
	lst->head = NULL;
	return lst;
}

Node* create_node(int num, Node* nxt) {
	Node* n = (Node *) malloc(sizeof(Node));
	n->data = num;
	n->next = nxt;
}

BOOL is_empty(List* lst) {
	return lst->head == NULL;
}

void input_list(List* lst) {
	//INPUT -1 TO STOP
	int input;
	//get input from user
	printf("Please enter a number:");
	scanf("%d", &input);
	//Creating head
	Node* temp = create_node(input, NULL);
	lst->head = temp;
	//get input again:
	printf("Please enter a number:");
	scanf("%d", &input);
	while(input != -1) {
		Node* curr = create_node(input, NULL);
		temp->next = curr;
		temp = temp->next;
		//get input again.
		printf("Please enter a number:");
		scanf("%d", &input);
	}
}

void print_list(List* lst) {
	if(is_empty(lst)) return;
	Node* temp = lst->head;
	while(temp != NULL) {
		printf("%d\t", temp->data);
		temp = temp->next;
	}
}

void main() {
	List* a = create_list();
	input_list(a);
	print_list(a);
}
