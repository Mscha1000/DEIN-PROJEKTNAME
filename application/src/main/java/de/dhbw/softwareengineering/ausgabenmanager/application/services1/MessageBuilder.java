package de.dhbw.softwareengineering.ausgabenmanager.application.services1;

public class MessageBuilder {
    private String greeting;
    private String body;
    private String closing;

    private MessageBuilder(Builder builder) {
        this.greeting = builder.greeting;
        this.body = builder.body;
        this.closing = builder.closing;
    }

    public String buildMessage() {
        StringBuilder message = new StringBuilder();
        if (greeting != null) {
            message.append(greeting).append("\n");
        }
        if (body != null) {
            message.append(body).append("\n");
        }
        if (closing != null) {
            message.append(closing);
        }
        return message.toString();
    }

    public static class Builder {
        private String greeting;
        private String body;
        private String closing;

        public Builder greeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder closing(String closing) {
            this.closing = closing;
            return this;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this);
        }
    }
}