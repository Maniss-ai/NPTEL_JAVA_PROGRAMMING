
//Use for or while loop do the operation.
double sum = 0;
double count = 0;
for(int i = 0; i < arr.length; i++){
  if(arr[i]%2 == 0) {
  	sum += arr[i];
    count++;
  }
}

System.out.print(sum/count);