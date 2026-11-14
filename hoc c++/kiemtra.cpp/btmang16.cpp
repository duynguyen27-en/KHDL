#include <stdio.h>
void nhapmang(int ma[], int &n, float diem[])
{
    printf("nhap so luong sinh vien n la :");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("nhap thong tin sinh vien thu %d :\n", i + 1);
        printf("ma sv ma[%d]:", i);
        scanf("%d", &ma[i]);
        do
        {
            printf("diem sv diem[%d]:", i);
            scanf("%f", &diem[i]);
        } while (diem[i] < 0 || diem[i] > 10);
    }
}
void xuatmang(int ma[], int n, float diem[])
{
    for (int i = 0; i < n; i++)
    {
        printf("\nsinh vien thu %d : ma sv: %d co diem : %.2f", i + 1, ma[i], diem[i]);
    }
}
void diemtb(int ma[], int n, float diem[])
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += diem[i];
    }
    float tb = (float)sum / n;
    printf("\ndiem trung binh la :%.2f", tb);
    for (int i = 0; i < n; i++)
    {
        if (diem[i] > tb)
        {
            printf("\nsinh vien co diem cao hon tb la : ma sv : %d co diem :%.2f ", ma[i], diem[i]);
        }
    }
}
long cheak(long n)
{
    while (n >= 10)
    {
        n /= 10;
    }
    if (n == 2)
    {
        return 1;
    }
    return 0;
}

void so2dau(int ma[], int n, float diem[])
{
    for (int i = 0; i < n; i++)
    {
        if (cheak(ma[i]))
        {
            float temp = diem[i] + 3;
            if (temp > 10)
            {
                temp = 10;
            }
            printf("\nma sv :%d diem moi :%.2f", ma[i], temp);
        }
        else
        {
            printf("\nma sv :%d diem:%.2f", ma[i], diem[i]);
        }
    }
}
void removeStudentsBelow7(int ma[], int n, float diem[])
{
    for (int i = 0; i < n; i++)
    {
        if (diem[i] < 7)
        {
            for (int j = i; j < n; j++)
            {
                ma[j] = ma[j + 1];
                diem[j] = diem[j + 1];
            }
            n--;
            i--;
        }
    }
    printf("\ndanh sach sinh vien co diem >= 7 :\n");
    xuatmang(ma, n, diem);
}
void giamdan(int ma[], int n, float diem[])
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (diem[i] < diem[j])
            {
                int temp = diem[i];
                diem[i] = diem[j];
                diem[j] = temp;

                int tamp = ma[i];
                ma[i] = ma[j];
                ma[j] = tamp;
            }
        }
    }
    xuatmang(ma, n, diem);
}

void chuyenmang(int ma[], int n, int mab[], int mac[], float diem[], float diemb[], float diemc[])
{
    float sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += diem[i];
    }
    float tb = (float)sum / n;
    printf("\ndiem trung binh la :%.2f", tb);
    int bb = 0, cc = 0;
    for (int i = 0; i < n; i++)
    {
        if (diem[i] > tb)
        {
            mab[bb] = ma[i];
            diemb[bb] = diem[i];
            bb++;
        }
        else
        {
            mac[cc] = ma[i];
            diemc[cc] = diem[i];
            cc++;
        }
    }
    printf("\ndanh sach sinh vien co diem cao hon tb :\n");
    xuatmang(mab, bb, diemb);
    printf("\ndanh sach sinh vien co diem thap hon hoac bang tb :\n");
    xuatmang(mac, cc, diemc);
    printf("\ndanh sach sinh vien co diem cao hon tb sau khi sap xep giam dan :\n");
    giamdan(mab, bb, diemb);
    printf("\ndanh sach sinh vien co diem thap hon hoac bang tb sau khi sap xep giam dan :\n");
    giamdan(mac, cc, diemc);
}

int main()
{
    int n;
    int ma[100], mab[100], mac[100];
    float diem[100], diemb[100], diemc[100];
    nhapmang(ma, n, diem);
    xuatmang(ma, n, diem);
    // diemtb(ma, n, diem);
    // so2dau(ma, n, diem);
    // removeStudentsBelow7(ma, n, diem);
    chuyenmang(ma, n, mab, mac, diem, diemb, diemc);
    return 0;
}