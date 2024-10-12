
        class TwoBinaryNumSum{
            public static void main(String[] args) {
                String binary1 = "00101";
                String binary2 = "0110";
                String result = addTwoBinary(binary1, binary2);
                System.out.println(result);
            }

            private static String addTwoBinary(String binary1, String binary2) {
                if((binary1 != null && binary1.length() == 0) && (binary2 != null && binary2.length() == 0)){
                    return "";
                }
                if(binary1 != null && binary1.length() == 0){
                    return binary2;
                }
                if(binary2 != null && binary2.length() == 0){
                    return binary1;
                }
                int carry =0;
                StringBuilder sb = new StringBuilder();
                binary1 = binary1.replaceFirst("^0+(?!$)", "");
                binary2 = binary2.replaceFirst("^0+(?!$)", "");
                int i = binary1.length()-1;
                int j = binary2.length()-1;

                while (i >=0  || j >=0 || carry==1){
                    int sum = carry;
                    if(i>=0) {
                        sum += binary1.charAt(i--) -'0';
                    }
                    if(j>=0) {
                        sum += binary2.charAt(j--) -'0';
                    }
                    sb.append(sum%2);
                    carry = sum/2;
                }

                return sb.reverse().toString();
            }
        }