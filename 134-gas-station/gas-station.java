class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0;
        int scost = 0;

        for (int i = 0; i < gas.length; i++) {
            sGas += gas[i];
        }

        for (int i = 0; i < cost.length; i++) {
            scost += cost[i];
        }

        if (sGas < scost) {
            return -1;
        } else {
            int start = 0;
            int tank = 0;

            for (int i = 0; i < gas.length; i++) {
                tank += gas[i] - cost[i];

                if (tank < 0) {
                    start = i + 1;
                    tank = 0;
                }
            }

            return start;
        }
    }
}