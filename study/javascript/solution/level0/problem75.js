function solution(array, n) {
    let result = 0;
    array.filter((a) => {
        if (a == n) {
            result += 1;
        }
    });
    return result;
}
