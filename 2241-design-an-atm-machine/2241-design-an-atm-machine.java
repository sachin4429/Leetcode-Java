class ATM {
    long[] notes;
    int[] denom = {20, 50, 100, 200, 500};
    public ATM() {
        notes = new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i<5; i++)
        {
            notes[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int temp[] = new int[5];
        for(int i = 4; i>=0; i--)
        {
            int maxNotes = amount/denom[i];
            temp[i] = (int)Math.min(maxNotes, notes[i]);
            amount -= temp[i]*denom[i];
            if(amount == 0)
                break;
        }
        if(amount != 0)
            return new int[]{-1};
        for(int i=0;i<5;i++)
        {
            notes[i]-=temp[i];
        }
        return temp;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */