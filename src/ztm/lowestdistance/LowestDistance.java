package ztm.lowestdistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LowestDistance {
    //?Pratik Sherdiwala (Codelytics)
    static List<Block> blocks = new ArrayList<>();

    {
        blocks.add(
                new Block(
                        1,
                        false,
                        true,
                        false
                )
        );

        blocks.add(
                new Block(
                        2,
                        true,
                        true,
                        false
                )
        );

        blocks.add(
                new Block(
                        3,
                        false,
                        true,
                        true
                )
        );

        blocks.add(
                new Block(
                        4,
                        false,
                        false,
                        false
                )
        );

        blocks.add(
                new Block(
                        5,
                        true,
                        true,
                        false
                )
        );

        blocks.add(
                new Block(
                        6,
                        false,
                        true,
                        true
                )
        );
    }

    //! need to solve
    static boolean checkForPreviousAndNextBlock(Block currentBlock, Block nextBloc, Block previousBlock) {

        if(nextBloc == null || previousBlock == null) return false;

        boolean shouldNearFromOffice = false;
        boolean shouldNearFromStore = false;
        boolean shouldNearFromSchool = false;



        return false;
    }

    public static void main(String[] args) {

        HashMap<Block, Boolean> lowestDistanceAssumption = new HashMap<>();

        for (int i = 0; i < blocks.size(); i++) {
            Block currentBlock = blocks.get(i);
            Block previousBlock = ((i - 1) < 0) ? null : blocks.get(i - 1);
            Block nextBlock = ((i + 1) > blocks.size()) ? null : blocks.get(i + 1);

            lowestDistanceAssumption
                    .put(
                            currentBlock,
                            checkForPreviousAndNextBlock(
                                    currentBlock,
                                    nextBlock,
                                    previousBlock
                            )
                    );
        }
    }
}
