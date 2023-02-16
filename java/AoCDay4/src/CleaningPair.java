public class CleaningPair {
    public Integer elf1Start = 0;
    public Integer elf1End = 0;
    public Integer elf2Start = 0;
    public Integer elf2End = 0;
    public Boolean isOverlap = false;

    public CleaningPair(String ranges){
        String[] elfRanges = ranges.split(",");
        String[] elf1Ranges = elfRanges[0].split("-");

        elf1Start = new Integer(elf1Ranges[0]);
        elf1End = new Integer(elf1Ranges[1]);

        String[] elf2Ranges = elfRanges[1].split("-");

        elf2Start = new Integer(elf2Ranges[0]);
        elf2End = new Integer(elf2Ranges[1]);
        System.out.println("Checking Pair 1: " + elf1Start + "--" + elf1End + " vs Pair 2: " + elf2Start + "--" + elf2End);
        //Check if Elf1 Contains Elf2 Range
        if(elf1Start <= elf2Start && elf1End >= elf2End) { isOverlap = true; };

        //Check if Elf2 Contains Elf1 Range
        if(elf2Start <= elf1Start && elf2End >= elf1End) { isOverlap = true; };
    }
}
