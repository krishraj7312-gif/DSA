/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x<0) return false;
    let xcopy=x;
    let rev =0;
    
    while(x>0){
    let rem = x%10;
    rev = (rev*10) + rem;

    x = Math.floor(x/10);
    }
    return xcopy ===rev;
    
};