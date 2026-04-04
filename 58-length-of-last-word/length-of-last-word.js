/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    // start from last
    let n = s.length-1;

    while(n>=0){  // condition is that i will run until there is one space to stop at -1
        if(s[n] === " "){
            n--; // removing all the spaces
        }else{
            break;// is space end means alohabet starrt then we wil break it
        }
    }
    // now we reach at last alphabet
    let count = 0;
    while(n>=0){
        if(s[n] != " "){ // countning until i reach the last character
            --n;
            ++count;
        }else{
            break;
        }
    }
    return count;
};