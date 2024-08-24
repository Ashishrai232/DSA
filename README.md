# DSA
#################################################################################################################
for getting factors of a number :
run loop till i*i<=num and eliminate the case add the i which divides num along with num/i except where (i=num/i)

for(int i=1;i*i<=num;i++)
{
    if(num%i ==0)
    {
        sum+=i;
        if(i!=num/i)
        {
          sum+=num/i;
        }
    }
 }
 ################################################################################################################
