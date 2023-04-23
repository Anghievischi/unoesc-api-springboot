Documentação para funcionamento do Arquivo BASH 


•	Instalar um terminal que o Windows 10 disponibiliza na Microsoft Store, como o ubuntu.

•	Instalar via terminal atualizações e o PostgreSql:

        SUDO APT UPDATE

        SUDO APT UPGRADE

        SUDO SH -C 'ECHO "DEB HTTP://APT.POSTGRESQL.ORG/PUB/REPOS/APT $(LSB_RELEASE -CS)-PGDG MAIN" >               /ETC/APT/SOURCES.LIST.D/PGDG.LIST'

        WGET --QUIET -O - HTTPS://WWW.POSTGRESQL.ORG/MEDIA/KEYS/ACCC4CF8.ASC | SUDO APT-KEY ADD –

        SUDO APT-GET -Y INSTALL POSTGRESQL

•	Criar SuperUser no Postgres

        psql -U nome_do_usuario -d nome_do_banco_de_dados

        CREATE USER nome_do_usuario WITH PASSWORD 'senha_do_usuario' SUPERUSER;

        \q

•	Criar o banco de dados

        createdb nome-do-banco_de_dados

•	Permitir que todos os usuários acessem o banco de dados PostgreSQL , você pode editar o arquivo pg_hba.conf e adicionar uma regra que permita o acesso de todos os usuários.

        # TYPE  DATABASE        USER            ADDRESS                 METHOD
        host    all             all             0.0.0.0/0               md5

•	Aceitar todas as conexões no banco de dados, como o DBeaver. Ir no aqruivo /etc/postgresql/15/main/postgresql.conf

        # - Connection Settings -

        listen_addresses = '*'          # what IP address(es) to listen on;


•	No projeto Unoesc-API-SpringBoot acessar a ProjetoBash e  rodar o arquivo bashApi.sh com o comando:

        sh bashApi.sh 
