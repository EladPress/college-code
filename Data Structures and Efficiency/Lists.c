#include <stdlib.h>

typedef struct List_Node {
	int data;
	struct List_Node* next;
} List_Node;

typedef struct List {
	List_Node* head;
}List;

List* Create_List() {
	List* lst = (List*) malloc(sizeof(List));
	lst->head = NULL;
	return lst;
}

List_Node* Create_Node(int k, List_Node* nxt) {
	List_Node* node = (List_Node*) malloc(sizeof(List_Node));
	node->data = k;
	node->next = nxt;
	return node;
}

int is_empty(List* lst) {
	return lst->head == NULL;
}


void insert(List_Node* place, List_Node* dest) {
	dest->next = place->next;
	place->next = dest;
}


void printList(List* L) {
	List_Node* tmp = L->head;
	while(tmp != NULL) {
		printf("%d\t", tmp->data);
		tmp = tmp->next;
	}
}

int delete_node(List_Node* x, List* lst) {
	if(x == lst->head) return delete_first(lst);
	List_Node* y = lst->head;
	while(y->next != x)
		y = y->next;
	y->next = x->next;
	free(x);
	return 1;
}