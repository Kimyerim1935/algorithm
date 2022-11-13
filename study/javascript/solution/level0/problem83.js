function solution(sides) {
    const min = Math.min(...sides);
    const max1 = Math.max(...sides);
    const max2 = min + max1 - 1;
    return max2 - (max1 - min);
}
