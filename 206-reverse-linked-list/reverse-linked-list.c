/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* h) {
    struct ListNode* prev=NULL;
	struct ListNode* next=NULL;
	struct ListNode* curr=h;
	while(curr!=NULL){
		next=curr->next;
		curr->next=prev;
		prev=curr;
		curr=next;

	}
	h=prev;
    return h;
}