class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int netGas = gas[i] - cost[i];
            
            totalTank += netGas;
            currentTank += netGas;

            // If we run out of gas at station i
            if (currentTank < 0) {
                // Reset starting station to the next one
                startingStation = i + 1;
                // Reset current tank for the new journey
                currentTank = 0;
            }
        }

        // If total gas available is less than total cost, return -1
        return totalTank >= 0 ? startingStation : -1;
    }
}