var MyLinkedList = function () {
    this.head = null;
    this.size = 0;
};

function ListNode(val) {
    this.val = val;
    this.next = null;
}

MyLinkedList.prototype.get = function (index) {
    if (index < 0 || index >= this.size) return -1;

    let current = this.head;
    for (let i = 0; i < index; i++) {
        current = current.next;
    }
    return current.val;
};

MyLinkedList.prototype.addAtHead = function (val) {
    const newNode = new ListNode(val);
    newNode.next = this.head;
    this.head = newNode;
    this.size++;
};

MyLinkedList.prototype.addAtTail = function (val) {
    const newNode = new ListNode(val);

    if (!this.head) {
        this.head = newNode;
    } else {
        let current = this.head;
        while (current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    this.size++;
};

MyLinkedList.prototype.addAtIndex = function (index, val) {
    if (index < 0 || index > this.size) return;

    if (index === 0) {
        this.addAtHead(val);
        return;
    }

    if (index === this.size) {
        this.addAtTail(val);
        return;
    }

    let prev = this.head;
    for (let i = 0; i < index - 1; i++) {
        prev = prev.next;
    }

    const newNode = new ListNode(val);
    newNode.next = prev.next;
    prev.next = newNode;
    this.size++;
};

MyLinkedList.prototype.deleteAtIndex = function (index) {
    if (index < 0 || index >= this.size) return;

    if (index === 0) {
        this.head = this.head.next;
        this.size--;
        return;
    }

    let prev = this.head;
    for (let i = 0; i < index - 1; i++) {
        prev = prev.next;
    }

    prev.next = prev.next.next;
    this.size--;
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */