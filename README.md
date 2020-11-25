# PGSQLJAVA
一个pgsql 4 java版，使用了mybatis plus(虽然我很讨厌mp)，使用了spring boot。



## INSTALL DOCKER 
IN `manjaro`
```shell script

```
## INSTALL PGSQL4docker
```shell
sudo docker pull postgres
sudo docker volume create dv_pgdata
sudo docker run --name my_postgres -v dv_pgdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=xxxxxx -p 5432:5432 -d postgres
```
username:`postgres`
password:`xxxxxx`
## INSTALL PGSQLADMIN

```shell script
sudo docker pull dpage/pgadmin4
sudo docker run --name pgadmin -p 5080:80 \
    -e 'PGADMIN_DEFAULT_EMAIL=pekkle@abc.com' \
    -e 'PGADMIN_DEFAULT_PASSWORD=xxxxxx' \
    -e 'PGADMIN_CONFIG_ENHANCED_COOKIE_PROTECTION=True' \
    -e 'PGADMIN_CONFIG_LOGIN_BANNER="Authorised users only!"' \
    -e 'PGADMIN_CONFIG_CONSOLE_LOG_LEVEL=10' \
    -d dpage/pgadmin4:4.17
```
username:`pekkle@abc.com`
password:`xxxxxx`

## USAGE
open browser,visit url`http://172.16.88.165:5080/browser/`

