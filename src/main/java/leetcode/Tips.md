## 算法技巧  
#### 数字处理  
求个位数一般使用 `%10` 来进行，求十位以上的数字一般直接使用 `/10` 来进行计算。  
  
求 int 范围内溢出 `base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)`  
然后在进行数值转换 `base = 10 * base + (str.charAt(i++) - '0');`