public class GrandPa{
    boolean CompareHuluwa_less(Huluwa one, Huluwa another){
        return one.index <= another.index;
    }
    void SwapTwoPos(Huluwa[] pre_queue, int i, int j){
        pre_queue[i].Swapwithnext(pre_queue, i, j);
    }
    void SortHuluwa(Huluwa[] pre_queue){
        for(int i = 0; i < pre_queue.length - 1; i++){
            for(int j = 0; j < pre_queue.length - 1 - i; j++){
                if(CompareHuluwa_less(pre_queue[j + 1], pre_queue[j])){
                    SwapTwoPos(pre_queue, j, j + 1);
                }
            }
        }
    }
    void CmdReportNum(Huluwa[] Hulu_Queues){
        System.out.println("爷爷指挥葫芦娃们报数");
        for(int i = 0; i < Hulu_Queues.length; i++){
            Hulu_Queues[i].report_num();
            System.out.print(" ");
        }
        System.out.println();
    }
}