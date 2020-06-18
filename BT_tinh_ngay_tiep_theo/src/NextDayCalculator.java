public class NextDayCalculator {
    public void nextDay(int nDay,int nMonth,int nYear) {
        nDay++;
        if(nDay > numofDays(nMonth,nYear)) {
            nDay = 1;
            nMonth++;
            if(nMonth > 12) {
                nMonth = 1;
                nYear++;
            }
        }
    }

    public boolean isLeapyear(int nYear) {
        if((nYear % 4 == 0 && nYear%100 !=0) || nYear%400 == 0) {
            return true;
        }
        return false;
    }

    public int numofDays(int nMonth,int nYear) {
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

    public boolean validDays(int nDay,int nMonth,int nYear) {
        boolean result = true;
        if(!(nYear>0)) {
            result = false;
        }
        if (!(nMonth >= 1 && nMonth <= 12))
        {
            result = false; // Ngày không còn hợp lệ nữa!
        }

        // Kiểm tra ngày
        if (!(nDay >= 1 && nDay <= numofDays(nMonth, nYear)))
        {
            result = false; // Ngày không còn hợp lệ nữa!
        }

        return result; // Trả về trạng thái cuối cùng...
    }


}
