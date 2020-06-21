public class NextDayCalculator {
    public static String nextDay(int nDay,int nMonth,int nYear){

        nDay++;
        if(nDay > numofDays( nMonth,nYear)) {
            nDay = 1;
            nMonth++;
            if( nMonth > 12) {
                nMonth = 1;
                nYear++;
            }
        }
        return nDay+ "/" +nMonth+ "/" +nYear;
    }

    public static boolean isLeapyear(int nYear) {
        if((nYear % 4 == 0 && nYear%100 !=0) || nYear%400 == 0) {
            return true;
        }
        return false;
    }

    public static int numofDays(int nMonth,int nYear) {
        int nNumofDays = 0;
        switch(nMonth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nNumofDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nNumofDays = 30;
                break;
            case 2:
                if(isLeapyear(nYear)) {
                    nNumofDays = 29;
                }
                else {
                    nNumofDays = 28;
                }
                break;
        }
        return nNumofDays;
    }
}
