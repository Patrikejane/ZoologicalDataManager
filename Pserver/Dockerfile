FROM python:3.10

WORKDIR /app

COPY  ./requirements.txt /app/requirements.txt
COPY app.py ./app.py

RUN pip3 install -r requirements.txt

COPY . /app
ENTRYPOINT [ "python3" ]
CMD [ "app.py"]
