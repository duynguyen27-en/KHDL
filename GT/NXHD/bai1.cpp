#include <stdio.h>
#include <stack>
using namespace std;


void nhap(int &n, stack<int> &st) {
    printf("nhap so phan tu n : ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int x;
        printf("Nhap phan tu thu %d: ", i + 1);
        scanf("%d", &x);
        st.push(x);
    }
}


void in(stack<int> st) {
    printf("Ket qua dao nguoc: ");
    while (!st.empty()) {
        printf("%d ", st.top());
        st.pop();
    }
    printf("\n");
}

int main() {
    int n;
    stack<int> st;

    nhap(n, st);
    in(st);

    return 0;
}