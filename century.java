//function to be called by main
int centuryFromYear(int year) 
{
    int j,k;
    if(year%100!=0)
    {
        j = (year/10)+1;
        k = (year/10) *10 ;  
        if(year >= j && year <= (k+10))
        {
            year = (year/100) + 1;
        }
    }
        else
        year = (year/100);
        return year;
}

//main