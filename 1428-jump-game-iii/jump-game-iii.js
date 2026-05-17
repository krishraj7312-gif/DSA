/**
 * @param {number[]} arr
 * @param {number} start
 * @return {boolean}
 */
var canReach = function(arr, start) {
    
    let queue = [];
    let visited = new Array(arr.length).fill(false);

    queue.push(start);
    visited[start] = true;

    while(queue.length > 0){

        let i = queue.shift();

        // found 0
        if(arr[i] === 0){
            return true;
        }

        let forward = i + arr[i];
        let backward = i - arr[i];

        // forward jump
        if(forward < arr.length && !visited[forward]){
            queue.push(forward);
            visited[forward] = true;
        }

        // backward jump
        if(backward >= 0 && !visited[backward]){
            queue.push(backward);
            visited[backward] = true;
        }
    }

    return false;
};