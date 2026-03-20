/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let xcopy = x;
    let rev =0;

    x=Math.abs(x);
    while(x>0){
        rem = x%10;
        rev = (rev*10) + rem;
        x=Math.floor(x/10);
    }
    

    let limit = Math.pow(2,31);
    if (rev<-limit || rev > limit) return 0;

    return(xcopy<0 ? -rev : rev);
};