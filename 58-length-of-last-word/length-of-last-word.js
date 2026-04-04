/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    // approach 3
    let n = s.length-1
    let count = 0;
    while(n>=0){
        if(s[n] != " "){
            
            ++count;

        }
        else if(count>0){
            break;

        }
        --n;
    }
    return count;
};