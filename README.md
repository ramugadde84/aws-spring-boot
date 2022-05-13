# aws-spring-boot
AWS EKS and Spring boot Application

1) Create AWS Free Account
2) Create AWS IAM aws_access_key_id and aws_secret_access_key by searching IAM in AWS Console.
3) We need to connect with AWS console from local for that we need to use 
    3.1) c:/> aws configure 
    3.2) when we run above command it will ask access ID and access secret key and default region name and default output format
4)After running above step we will get .aws/credentials and .aws/config file.
5)If we wants to use AWS EKS we need to install eksctl and kubectl in local
